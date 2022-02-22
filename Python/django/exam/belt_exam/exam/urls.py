from django.urls import path     
from . import views
urlpatterns = [
    path('main/<int:user_id>', views.index),
    path('logout/', views.logout), 	   
    path('add_wish', views.add_wish), 	   
    path('handel_add', views.handel_wish), 	   
    path('delet/<int:delet_id>', views.remove),	   
    path('edit/<int:edit_id>', views.edit),	   
    path('handel_edit/<int:edit_id>', views.handel_edit),	   
    path('handel_grant/<int:wish_id>', views.grant),	   
]