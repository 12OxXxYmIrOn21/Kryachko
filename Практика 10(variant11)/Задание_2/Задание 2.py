from random import randint
file = open(r'C:\Users\User\Desktop\vvod2_kryachko_y-224.txt', 'w+', encoding='UTF-8')

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

file = open(r'C:\Users\User\Desktop\vvod2_kryachko_y-224.txt', 'r')
filee = open(r'C:\Users\User\Desktop\vivod2_kryachko_y-224.txt', 'w+', encoding='UTF-8')

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
file = open(r'C:\Users\User\Desktop\vvod2_kryachko_y-224.txt', 'r')

R = file.readlines()

e1 = n1+n2+n3
e2 = n4+n5+n6
e3 = n7+n8+n9

print(e1)
print(e2)
print(e3)

A = 0
for number in e1:
    A += number
print(A)

B = 0
for number in e2:
    B += number
print(B)

C = 0
for number in e3:
    C += number
print(C)


print('Произведение первого столбца',A)
print('Произведение второго столбца',B)
print('Произведение третьего столбца',C)
print()
if B > A < C:
    print(n2,n1,n3)
    print(n5,n4,n6)
    print(n8,n7,n9)
    filee.write('\n')
    filee.write(str([n2,n1,n3,n5,n4,n6,n8,n7,n9]))
    filee.close()
elif A > B < C:
    print(n1,n3,n2)
    print(n4,n6,n5)
    print(n7,n9,n8)
    filee.write('\n')
    filee.write(str([n1,n3,n2,n4,n6,n5,n7,n9,n8]))
    filee.close()
elif A > C < B:
    print(n3,n2,n1)
    print(n6,n5,n4)
    print(n9,n8,n7)
    filee.write('\n')
    filee.write(str([n3,n2,n1,n6,n5,n4,n9,n8,n7]))
    filee.close()
  

      
