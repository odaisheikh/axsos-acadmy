import random
def randInt(min= 2  , max=5   ):
    num =int(random.random() * max + min)
    return num

print(randInt())
print(randInt()) 		    
print(randInt(max=50)) 	   
print(randInt(min=50)) 	    
print(randInt(min=50, max=500))
print(randInt(min=50, max=500))
print(randInt(min=50, max=500))
print(randInt(min=50, max=500))


