from random import *    #Вариант 11#
def F():
    a = [randint(10,100) for i in range(10)]
    x = a[0]
    for i in a:
        if i > x and i % 2 ==0:
            x = i
    print(a)
    print(x)
F()    
