from django.urls import path     
from . import views
urlpatterns = [
    path('main/<int:user_id>', views.main),   
    path('handel', views.handel_main),  
    path('logout/', views.logout), 
    path('favorit/<int:book_id>', views.favorit), 
    path('add_favorit/<int:book_id>', views.add_favorit), 
    path('update/<int:book_id>', views.update),
    path('delete/<int:book_id>', views.delete),
]