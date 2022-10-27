from random import *    #Вариант 11#
a = [randint(1,100) for i in range(10)]
b = []
for i in a:
    if i % 2 == 0 and i < 10:
        b.append(i)
if len(b) == 0:  #Если не нашлось подходящих чисел строка равна 0#
    print('Исходный массив',a)
    print('Таких числе нет')
else:
    print('Исходный массив',a)
    print('Полученный массив',b)
    
