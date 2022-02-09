from django.urls import path     
from . import views
urlpatterns = [
    path('', views.form),
    path('add_users', views.handel)	   
]