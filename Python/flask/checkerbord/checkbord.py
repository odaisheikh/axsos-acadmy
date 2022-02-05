from flask import Flask,render_template
app = Flask(__name__)
@app.route('/check/<row>/<cell>')
def check(row , cell):
    print("*")
    return render_template ("index.html" , y = int(row), x = int(cell))
@app.route('/')
def check1():
    print("*")
    return render_template ("index.html" , y = int(5), x = int(5))
if __name__ == "__main__":
    app.run(debug=True,port=5001)

