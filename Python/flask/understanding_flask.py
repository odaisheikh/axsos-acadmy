from flask import Flask, render_template # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
@app.route('/')
def hello_world():
    return 'Hello World!'

@app.route('/dojo')
def dojo():
    return 'DOJO' 


@app.route('/say/<name>')
def sy(name):
    return f'Hello {name}' 


@app.route('/repate/<num>/<name>')
def repate(num,name):
    return f'Hello  {name}'*int(num)
if __name__=="__main__":
        app.run(debug=True)
