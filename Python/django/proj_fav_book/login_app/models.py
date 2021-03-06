from django.db import models

class BlogManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['first_name']) < 2:
            errors["first_name"] = "Blog first_name should be at least 2 characters"
        if len(postData['last_name']) < 2:
            errors["last_name"] = "Blog last_name should be at least 2 characters"
        if len(postData['email']) < 8:
            errors["email"] = "Blog email should be at least 8 characters"
        if len(postData['password']) < 8:
            errors["password"] = "Blog password should be at least 8 characters"
        if len(postData['confirm_pw']) < 8:
            errors["confirm_pw"] = "Blog confirm_pw should be at least 8 characters"
        if (postData['confirm_pw'] != postData['password']):
            errors["confirm_pw"] += "Blog not maching characters"
        # if (datetime.date(postData['releas']) < datetime.date(datetime.now())):
        #     errors["releas"] =" title should be at least 10 characters time shoud be no in the future"
        return errors
    
    def check_login(self):
        errors = {}
        errors["email"] = "youre email or password not correct"
        return errors

class Login(models.Model):
    first_name = models.CharField(max_length=45)
    last_name = models.CharField(max_length=45)
    email = models.CharField(max_length=45)
    password = models.CharField(max_length=45)
    confirm_pw = models.CharField(max_length=45)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = BlogManager()


class Book(models.Model):
    title = models.CharField(max_length=255)
    desc = models.TextField(default=True)
    uploded_by = models.ForeignKey(Login, related_name="books_uploded", on_delete = models.CASCADE)
    users_who_likes = models.ManyToManyField(Login,related_name='liked_books')
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)



