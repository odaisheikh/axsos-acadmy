# Generated by Django 2.2.4 on 2022-02-19 12:32

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('login_app', '0005_book_desc'),
    ]

    operations = [
        migrations.RenameField(
            model_name='book',
            old_name='auploded_by',
            new_name='uploded_by',
        ),
    ]