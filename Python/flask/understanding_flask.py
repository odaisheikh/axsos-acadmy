from flask import Flask, render_template # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Hello World!!'  
@app.route('/success')
def success():
    return "success"
@app.route('/hello/<name>') 
def hello(name):
    print(name)
    return "Hello, " + name
@app.route('/hello/<name>/<id>')
def hello_name_id(name,id):
    print(name)
    print(id)
    return "username: " + name + ", id: " + id
@app.route('/hhh')
def output():
    print("dai")
    return render_template('index.html')
if __name__=="__main__":
        app.run(debug=True)
