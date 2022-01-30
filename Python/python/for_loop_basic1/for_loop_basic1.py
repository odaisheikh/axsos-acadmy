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
def CountDown(a):
    my_list = []
    for key in range(a,-1,-1):
        my_list.append(key)
    return my_list
print(CountDown(8))






