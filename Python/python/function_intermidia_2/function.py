x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]
x[1][0]=15
students[0][2]="bryana"
print(x)
print(students)
sports_directory["soccer"][0]="andress"
print(sports_directory["soccer"])
z [0]['y']=30
print(z)
#////////////////////////

def iterateDictionary(dic):
    for k in dic:
        for key, val in k.items():
            print(key, " = ", val)
def iterateDictionary1(dic):
    for k in dic:
        for key, val in k.items():
            print(key ,":", val)
students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
iterateDictionary1(students)
#//////////////////////
def iterateDictionary2 (key_name,list):
    for i in list:
        print(i[key_name])
students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
iterateDictionary2("first_name",students)
#////////////////////
def iterateDictionary3 (list):
    for i in list :
        print(i , len(i))
        for k in list[i]:
            print(k)

dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
iterateDictionary3 (dojo)
