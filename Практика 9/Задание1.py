n = 3
a = []
for i in range(n):
    b = []
    for j in range(n):
        print('Введите [',i,',',j,'] элемент')
        b.append(int(input()))
    a.append(b)

for i in range(n):
    for j in range(n):
        print(a[i][j], end=' ')
    print()

min=a[i][j]
for i in range(n):
    for j in range(n):
        if min>a[i][j]:
           min=a[i][j]
print(min)

for i in range(n):
    for j in range(n):
        if min==a[0][0] or min==a[0][1] or min==a[0][2]:
            print('Cумма строки с минимальным значением = ',a[0][0]+a[0][1]+a[0][2])
        elif min==a[1][0] or min==a[1][1] or min==a[1][2]:
            print('Cумма строки с минимальным значением =',a[1][0]+a[1][1]+a[1][2])
        else:
            print('Cумма строки с минимальным значением =',a[2][0]+a[2][1]+[2][2])

            
    
