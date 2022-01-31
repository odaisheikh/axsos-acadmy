def big(my_list):
    for key in range(len(my_list)):
        if my_list[key]>0:
            my_list[key]="big"
    return my_list
my_list = [-1,3,4,-6]
print(big(my_list))
#//////////////////////
def positiv(my_list):
    for key in range(len(my_list)):
        if my_list[len(my_list)-1] <0:
            my_list[len(my_list)-1]=my_list[len(my_list)-1]*-1
    return my_list
print(positiv([1,2,3,-5]))
#///////////////////////
def sumtotal(my_list):
    sum = 0
    for key in my_list:
        sum+=key
    return sum
print(sumtotal([-1,3,4,5]))
#//////////////////////
def sumtotal(my_list):
    sum = 0
    for key in my_list:
        sum+=key
    return sum/len(my_list)
print(sumtotal([-1,3,4,5]))
#////////////////////////
def dic(my_list):
    sum,av = 0,0
    animate = {}
    for key in my_list:
        sum+=key
    av = sum/len(my_list)
    animate = {"av":av,"sum":sum}
    return animate
print(dic([1,2,3,4,5]))




    