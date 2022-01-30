"""
for key in range(1,151):
    print(key)
for key in range(5,1001,5):
    print(key)
for key in range(1,101):
    if key % 10 == 0:
        print("Coding Dojo")
    elif key % 5 == 0:
        print("Coding")
    else :
        print(key)
sum = 0
for key in range(0,500001):
    if key % 2 != 0:
        sum+=key
print(sum)


for key in range(2018,0 ,-4):
    print(key)
    x,y,z = 0,99,4
for key in range(x,y,z):
    if key%z==0:
        print (key)
"""
#5
def a():
    return(5)
def a1():
    return("5")
print(a()+a1())
#7
def a(b,c):
    return str(b)+str(c)
print(a(2,5))
#9
def a(b,c):
    if b<c:
        return 7
    else:
        return 14
    return 3
print(a(2,3))
print(a(5,3))
print(a(2,3) + a(5,3))





