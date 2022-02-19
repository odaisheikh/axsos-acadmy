from django.urls import path     
from . import views
urlpatterns = [
    path('main/<int:id>', views.main_page),	   
    path('logout_wall', views.logout),	   
    path('post/<int:user_id>', views.post),	   
]