from django.shortcuts import render , HttpResponse ,redirect
from django.http import JsonResponse
def root(request):
    print("*")
    return redirect("/blog")
def index(request):
    print("*")
    return HttpResponse("placeholder to later display a list of all blogs")
def new(request):
    print("***")
    return HttpResponse("placeholder to display a new form to create a new blog")
def creat(request):
    return redirect("/")
def show(request,number):
    return HttpResponse(f'placeholder to display blog number {number}')
def edit(request,number):
    return HttpResponse(f'placeholder to edit blog number {number}')
def destroy(request,number):
    return redirect("/blog")
def json(request):
    return JsonResponse({"title": " my_first project \n jhfjhjdfhjhdsjhfjdhsjhjhjhsjdhfj", "status": False} )
