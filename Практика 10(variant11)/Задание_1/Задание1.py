from random import randint
file = open(r'C:\Users\User\Desktop\vvod1_kryachko_y-224.txt', 'w+', encoding='UTF-8')

a = [randint(1, 9) for i in range(10)]

file.write(str(a[1]))
file.write(str(a[2]))
file.write(str(a[3]))
file.write(str(a[4]))
file.write(str(a[5]))
file.write(str(a[6]))
file.write(str(a[7]))
file.write(str(a[8]))
file.write(str(a[9]))

file.close()

file = open(r'C:\Users\User\Desktop\vvod1_kryachko_y-224.txt', 'r')
filee = open(r'C:\Users\User\Desktop\vivod1_kryachko_y-224.txt', 'w+', encoding='UTF-8')

A1 = file.readline(1)
A2 = file.readline(1)
A3 = file.readline(1)
A4 = file.readline(1)
A5 = file.readline(1)
A6 = file.readline(1)
A7 = file.readline(1)
A8 = file.readline(1)
A9 = file.readline(1)

n1 = [int(x) for x in A1]
n2 = [int(x) for x in A2]
n3 = [int(x) for x in A3]
n4 = [int(x) for x in A4]
n5 = [int(x) for x in A5]
n6 = [int(x) for x in A6]
n7 = [int(x) for x in A7]
n8 = [int(x) for x in A8]
n9 = [int(x) for x in A9]

file.close()
file = open(r'C:\Users\User\Desktop\vvod1_kryachko_y-224.txt', 'r')

R = file.readlines()

e = [n1,n2,n3,n4,n5,n6,n7,n8]

print(e)

if min(e) == n1 or min(e) == n2 or min(e) == n3:
    s = n1+n2+n3
    total = 0
    for number in s:
        total+= number
    print(total)
    filee.write('\n')
    filee.write(str(total))
    filee.close()       
elif min(e) == n4 or min(e) == n5 or min(e) == n6:
    s = n4+n5+n6
    total = 0
    for number in s:
        total+= number
    print(total)
    filee.write('\n')
    filee.write(str(total))
    filee.close()

else:
    s = n7+n8+n9
    total = 0
    for number in s:
        total+= number
    print(total)
    filee.write('\n')
    filee.write(str(total))
    filee.close()
            


