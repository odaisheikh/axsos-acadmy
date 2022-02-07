from django.urls import path     
from . import views
urlpatterns = [
    path('', views.root), 
    path('blog/', views.index),
    path('blog/new', views.new),
    path('blog/creat', views.creat),
    path('blog/number/<number>', views.show),
    path('blog/<int:number>/edit',views.edit),
    path('blog/<int:number>/delet',views.destroy),
    path('blog/json',views.json)
    # path('bloges/', views.index)   
]