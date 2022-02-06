import secrets
from flask import Flask, redirect , render_template , request , session
app = Flask(__name__)
app.secret_key = "kjjkjkjkkjkjjkkj"
@app.route('/')
def counter():
    print("*"*50)
    if not 'count' in session:
        session['count'] = 1
    else:
        session['count'] += 1
    return render_template("index.html" ,counter = session['count'])
@app.route("/destroy_session" )
def clear():
    session.clear()
    return redirect('/')
@app.route("/add" )
def add():
    session['count'] +=1
    return redirect('/')
if __name__ == "__main__":
    app.run(debug=True , port=5003)