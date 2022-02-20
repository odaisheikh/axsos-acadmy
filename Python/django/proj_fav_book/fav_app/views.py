from http.client import HTTPResponse
from turtle import title
from django.shortcuts import render,redirect,HttpResponse
from login_app.models import Login,Book
from datetime import datetime, timedelta

def main(request , user_id):
    request.session['user'] = user_id
    user=Login.objects.get(id = user_id)
    context = {
        'user' :user,
        'this_book' :Book.objects.all(),
        'favorite' :user.liked_books.all()
    }
    return render(request,"main.html" , context)

def handel_main(request):
    this_book = Book.objects.create(title = request.POST['title'],desc = request.POST['desc'],
    uploded_by = Login.objects.get(id =request.session['user']))
    # this_book = Book.objects.get(title = request.POST['title'])
    this_user = Login.objects.get(id =  request.session['user'])
    this_book.users_who_likes.add(this_user)
    return redirect('/main/'+str(request.session['user']))

def logout(request):
    del request.session['user']
    return redirect('/')

def favorit(request,book_id):
    this_book = Book.objects.get(id = book_id)
    context = {
        'user':Login.objects.get(id = request.session['user']),
        'book':Book.objects.get(id = book_id),
        'users_likes':this_book.users_who_likes.all(),
            }
    return render(request,"favorit_books.html", context)

def add_favorit(request,book_id):
    this_book = Book.objects.get(id= book_id)
    this_user = Login.objects.get(id =request.session['user'])
    this_book.users_who_likes.add(this_user)
    return redirect('/main/'+str(request.session['user']))

def update(request,book_id):
    c = Book.objects.get(id = book_id)
    c.desc = request.POST['update_desc']
    c.save()
    return redirect('/favorit/'+str(book_id))

def delete(request,book_id):
    c = Book.objects.get(id = book_id)
    time = c.created_at
    x=time.strftime("%Y%m%d %H:%M:%S")
    print(x)
    today = datetime.now().strftime("%Y%m%d %H:%M:%S")
    theNewTimeType = datetime.strptime(x, '%Y%m%d %H:%M:%S')
    theNewTimeType1 = datetime.strptime(today, '%Y%m%d %H:%M:%S')
    theNewTimeType_after_30 = theNewTimeType + timedelta(hours = 3)
    print("%%%%%%%%%")
    print(theNewTimeType)
    print("%%%%%%%%%%%%%")
    print(theNewTimeType1)
    print("*********")
    print(type(time))
    print(type(datetime.now()))
    if theNewTimeType1 > (theNewTimeType_after_30) :
        c.delete()
    return redirect('/main/'+str(request.session['user']))
