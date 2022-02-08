from django.shortcuts import render,redirect
import random
from time import gmtime,strftime

def root(request):
    if not 'score' in request.session:
        request.session['score'] = 0
    if not 'message' in request.session:
        request.session['message'] = ''
    return render(request,'index.html')
def handle(request):
    if request.POST['which_form']=='farm':
        rand = random.randint(10,20)
        request.session['score'] +=rand
        print(request.session['score'])
        request.session['messege']+=f'\nfarm earn {rand} '
        return redirect('/')
    elif request.POST['which_form']=='cave':
        rand = random.randint(5,10)
        request.session['score'] +=rand
        request.session['messege']+=f'\nfarm earn {rand} '
        return redirect('/')
    elif request.POST['which_form']=='house':
        rand = random.randint(2,5)
        request.session['score'] +=rand
        request.session['messege']+=f'\nfarm earn {rand} '
        return redirect('/')
    elif request.POST['which_form']=='casino':
        rand = random.randint(-50,50)
        request.session['score'] +=rand
        request.session['messege']+=f'farm earn {rand} {strftime("%Y-%m-%d %H:%M %p", gmtime())}'
        return redirect('/')
    return redirect('/')
    # if location == 'farm':
    #     num = random.randint(10, 20)
    #     request.session['gold'] += num
    #     request.session[
    #         'message'] += f'<li style="color:green;">Earned {num} gold from the farm  ({datetime.now().strftime("%Y/%m/%d %I:%M %p")})</li>'

