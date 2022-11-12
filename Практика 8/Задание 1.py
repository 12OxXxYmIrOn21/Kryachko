from random import randint
def mix(ar): #Ищет максимальное значение в списке#
    amax = ar[0][0]
    n = len(ar)
    for i in range(n):
        if max(ar[i])>amax:
            amax = max(ar[i])
    return amax

def mixprint(a,b):#Выводит изначальные списки#
    for i in a:
        print(i)
    print()
    for i in b:
        print(i)
    print()

na = int(input('Введите длинну первой матрицы: '))
ma = int(input('количество элементов: '))
nb = int(input('Введите длинну второй матрицы: '))
mb = int(input('количество элементов: '))

a = [[randint(1,50) for i in range (ma)] for j in range(na)]#рандомное заполение списков#
b = [[randint(1,50) for i in range (mb)] for j in range(ma)]

mixprint(a,b)

amax = mix(a)
bmax = mix(b)

for i in range(len(a)): #Меняет максимальные значения в списках местами#
    for j in range(len(a[i])):
        a[i][j] = bmax if a[i][j] == amax else a[i][j]
for i in range(len(b)):
    for j in range(len(b[i])):
        b[i][j] = amax if b[i][j] == bmax else b[i][j]

mixprint(a,b)#Выводит списки с изменёнными значениями#
