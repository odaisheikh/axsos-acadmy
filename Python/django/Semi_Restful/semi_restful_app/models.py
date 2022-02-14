from datetime import datetime
from django.db import models

class BlogManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['title']) < 3:
            errors["title"] = "Blog title should be at least 3 characters"
        if len(postData['network']) < 3:
            errors["network"] = "Blog network should be at least 3 characters"
        if len(postData['desc']) < 10:
            errors["desc"] = "Blog description should be at least 10 characters"
        # if (datetime.date(postData['releas']) < datetime.date(datetime.now())):
        #     errors["releas"] =" title should be at least 10 characters time shoud be no in the future"


        return errors

class Show(models.Model):
    title = models.CharField(max_length=255)
    network = models.CharField(max_length=255)
    desc = models.CharField(max_length=255)
    releas =models.DateTimeField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = BlogManager()

