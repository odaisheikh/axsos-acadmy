from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('form/', views.form),
    path('handel', views.handel , name='prosess'),
    path('show',views.show)	   
]
