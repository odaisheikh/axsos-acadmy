# Generated by Django 2.2.4 on 2022-02-16 14:16

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('login_app', '0002_comment_message'),
    ]

    operations = [
        migrations.AddField(
            model_name='comment',
            name='coment',
            field=models.TextField(default=''),
        ),
        migrations.AddField(
            model_name='message',
            name='message',
            field=models.TextField(default=''),
        ),
    ]
