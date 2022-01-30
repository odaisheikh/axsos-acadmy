def CountDown(a):
    my_list = []
    for key in range(a,-1,-1):
        my_list.append(key)
    return my_list
print(CountDown(8))
#///////////////////
def re_p(a):
    print(a[0])
    return a[1]
print(re_p([1,2]))
#///////////////////
def p_re(a):
    return a[0]+len(a)
print(p_re([1,2,3,4,5]))
#///////////////////
def grate_than_secound(a):
    if len(a)<2:
        return False
    new_list = []
    for key in a:
        if(a[2]<key):
            new_list.append(key)
    return new_list
print(grate_than_secound([1,2,3,4,5,6,7,8]))
#////////////////////////
def length_value(length,value):
    new_list = []
    for key in range(0,length,1):
        new_list.append(value)
    return new_list
print (length_value(4,7))
