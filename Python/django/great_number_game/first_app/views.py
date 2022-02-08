from multiprocessing import context
from django.shortcuts import render ,redirect
import random
def game(request):
    return render(request,"index.html")
def check(request):
    rand = random.randint(1,100)
    request.session['rand']=rand
    if int(request.POST['number'])>request.session['rand']:
        context ={
            'x': 'too higth'
        }
        return render(request,"show.html",context)
    if int(request.POST['number'])<request.session['rand']:
        context ={
            'x': 'too low'
        }
        return render(request,"show.html",context)
    if int(request.POST['number'])==request.session['rand']:
        context ={
            'x': 'greet'
        }
        return render(request,"show.html",context)
    return render(request,"index.html")

