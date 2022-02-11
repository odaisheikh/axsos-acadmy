from multiprocessing import context
from django.shortcuts import render,redirect
from .models import User
def form(request):
    print("*")
    context = {
        'user':User.objects.all()
    }
    return render(request,"index.html" ,context)

def handel(request):
    print("*")
    User.objects.create(first_name = request.POST['first_name'],lastname_name = request.POST['last_name']
    ,email_address = request.POST['email'],age = request.POST['age'])
    return redirect ('/')
