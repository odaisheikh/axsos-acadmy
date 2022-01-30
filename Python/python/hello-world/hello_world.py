"""
print("hassan")
name = "odai"
print("hello ", name , "..")
num = 44
print("hello",num)
print("hello"+str(num))
first_food ,secound_food = "banana" , "mansf"
print("i love to eat {} and {}".format(first_food,secound_food))
print(f"i love to eat {first_food} and {secound_food}")
"""
y = 3
while y > 0:
    print(y)
    y = y - 1
    if y == 0:
        break
    else:		# only executes on a clean exit from the while loop (i.e. not a break)
        print("Final else statement")
# output: 3, 2, 1


