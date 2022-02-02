from xml.dom.minidom import Document
from flask import Flask,render_template
app = Flask(__name__)
@app.route('/play/<times>')
def play(times):
    print(times)
    return render_template ("index.html", some_times =int(times))
@app.route('/play')
def play_down():
    print("***")
    return render_template ("index.html", some_times =int(3))
@app.route('/play/<times>/<color>')
def play_smart(times,color):
    print(times , color)
    return render_template ("index.html", some_times =int(times) , color=color)
if __name__ == "__main__":
    app.run(debug=True)
