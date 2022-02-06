from flask import Flask , render_template , request
app = Flask(__name__)
@app.route('/form')
def index():
    return render_template("index.html")
@app.route('/users', methods=['POST'])
def create_user():
    print("Got Post Info")
    print(request.form)
    name_from_form = request.form['name']
    location_from_form = request.form['location']
    language_from_form = request.form['language']
    coment_from_form = request.form['coment']
    return render_template("index_show.html", name_on_template=name_from_form, location_on_template=location_from_form ,
    language_from_form = language_from_form , coment_from_form = coment_from_form  )
if __name__ == "__main__":
    app.run(debug=True , port=5002)