# Generated by Django 2.2.4 on 2022-02-12 12:45

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('dojo_ninja_app', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='dojo',
            name='desc',
            field=models.TextField(default='old_dojo'),
            preserve_default=False,
        ),
    ]
