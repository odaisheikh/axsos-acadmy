from http.client import HTTPResponse
from django.shortcuts import render ,HttpResponse

def index(request):
    return render(request,"index.html")
