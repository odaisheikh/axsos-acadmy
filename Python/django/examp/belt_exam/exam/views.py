from multiprocessing import context
from django.shortcuts import render,HttpResponse,redirect
from login_app.models import Login,Whish,WhishGranted
from django.contrib import messages

def index(request,user_id):
    request.session['user_id'] = user_id
    context = {
        'user_loged' : Login.objects.get(id = user_id),
        'wishs':Login.objects.get(id = user_id).books_uploded.all(),
        'all_wishs' : Whish.objects.all()

    }
    return render(request,'wish.html' , context)

def logout(request):
    del request.session['user_id']
    return redirect('/')

def add_wish(request):
    context = {
        'user_loged' : Login.objects.get(id = request.session['user_id'])
    }
    return render(request,'handel_wish.html' , context)

def handel_wish(request):
    request.session['flag'] = 'add'
    errors = Login.objects.wish_validator(request.POST)
    if len(errors) > 0:
        # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
        for key, value in errors.items():
            messages.error(request, value)
        # redirect the user back to the form to fix the errors
        return redirect('/add_wish')
    else:
        Whish.objects.create(item = request.POST['item'] , desc = request.POST['desc'],
        uploded_by = Login.objects.get(id =request.session['user_id']))
        return redirect('/main/'+str(request.session['user_id']))

def remove(request ,delet_id):
    c = Whish.objects.get(id = delet_id)
    c.delete()
    return redirect('/main/'+str(request.session['user_id'])) 

def edit(request ,edit_id):
    context = {
    'c' :  Whish.objects.get(id = edit_id),
    'user_loged' : Login.objects.get(id = request.session['user_id']),
    }
    return render(request , "edit.html" , context)

def handel_edit(request ,edit_id):
    request.session['flag'] = 'edit'
    errors = Login.objects.edit_validator(request.POST)
    if len(errors) > 0:
        # if the errors dictionary contains anything, loop through each key-value pair and make a flash message
        for key, value in errors.items():
            messages.error(request, value)
        # redirect the user back to the form to fix the errors
        return redirect('/edit/'+str(edit_id))
    else:
        c = Whish.objects.get(id = edit_id )
        c.item = request.POST['item']
        c.desc = request.POST['desc']
        c.save()
        return redirect('/main/'+str(request.session['user_id']))

def grant(request , wish_id):
    wish =  Whish.objects.get(id = wish_id)
    user = Login.objects.get(id = request.session['user_id'])
    wish.granted = True
    wish.save()
    # WhishGranted.objects.create( uploded_by = Login.objects.get(id =request.session['user_id']),whish_by = wish)
    return redirect('/main/'+str(request.session['user_id']))
    
