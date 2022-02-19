from email import message
from django.shortcuts import render,redirect
from login_app.models import Login,Message,Comment

def main_page(request,id):
    loged_id=request.session['id'] = id
    context = {
        'user' : Login.objects.get(id = id),
        'mess' : Message.objects.all
    }
    return render(request,"main_page.html",context)

def logout(request):
    del request.session['id']
    return redirect('/')

def post(request ,user_id):
    if request.POST['which_form']=='post':
        this_user = Login.objects.get(id = user_id)
        print(request.POST)
        Message.objects.create(user_id = this_user, message = request.POST['post'])
    elif request.POST['which_form']=='post_coment':
        Comment.objects.create(message_id = Message.objects.get(id =user_id ) ,user_id = Login.objects.get(id = request.session['id']) ,coment = request.POST['coment'])
    return redirect('/main/'+ str(request.session['id']))