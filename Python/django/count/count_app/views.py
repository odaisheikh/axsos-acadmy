from multiprocessing import context
from django.shortcuts import render , redirect


def counter(request):
    if not 'count' in request.session:
        request.session['count'] =0
    else:
        request.session['count'] +=1
    return render(request,'counter.html')
def clear(request):
    del request.session['count']	# clears a specific key
    return redirect('/')

