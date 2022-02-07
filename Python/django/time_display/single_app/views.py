from multiprocessing import context
from django.shortcuts import render
from time import gmtime, strftime
from datetime import datetime
    
def index(request):
    context = {
        "date": strftime("%Y-%m-%d ", gmtime()),
        "time": strftime("%H:%M %p" , gmtime()),
        "datetime_object" : datetime.strptime('Jun 1 2005  1:33PM', '%b %d %Y %I:%M%p')
    }
    return render(request,'index.html', context)
def form(request):
    return render(request , "dojo.html")
def handel(request):
    name = request.POST['name']
    location = request.POST['location']
    langueg = request.POST['langueg']
    context = {
        "x":name,
        "x1":location,
        "x2":langueg
    }
    return render(request,"view.html" , context)