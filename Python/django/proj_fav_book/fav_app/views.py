from http.client import HTTPResponse
from turtle import title
from django.shortcuts import render,redirect,HttpResponse
from login_app.models import Login,Book

def main(request , user_id):
    request.session['user'] = user_id
    
    context = {
        'user' :Login.objects.get(id = user_id),
        'this_book' :Book.objects.all(),
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
