# Generated by Django 2.2.4 on 2022-02-21 12:17

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('login_app', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='whish',
            name='granted',
            field=models.BooleanField(default=False),
        ),
    ]