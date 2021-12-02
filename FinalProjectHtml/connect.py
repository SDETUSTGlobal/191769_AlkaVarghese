from flask import Flask, render_template, request
from flask_mysqldb import MySQL
app = Flask(__name__)

app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'root'
app.config['MYSQL_PASSWORD'] = 'root'
app.config['MYSQL_DB'] = 'world'

mysql = MySQL(app)

@app.route('/', methods=['GET', 'POST'])
def user_index():
    if request.method == "POST":
        Fullname = request.form['fullname']
        EmplyID = request.form['iduser']
        Companyname = request.form['cmpny']
        EmailID = request.form['id_name']

        db_cur = mysql.connection.cursor()
        db_cur.execute("INSERT INTO connect(Empname, EmpId, Cmpname, Empemail) VALUES (%s, %s, %s, %s)", (Fullname, EmplyID, Companyname, EmailID))
        mysql.connection.commit()
        db_cur.close()
        return render_template('two.html', a=Fullname, b=EmplyID, c=Companyname, d=EmailID)
    return render_template('one.html')

@app.route('/two')
def section():
    return render_template('two.html')


if __name__ == '__main__':
    app.run()