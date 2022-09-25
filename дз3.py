x = int(input())
y = int(input())
z = int(input())
print(x+y+z)
a = int(input('первый катет a = '))
b = int(input('второй катет b = '))
print(1/2 * a*b)
n = int(input('n = '))
h = n // 60
if h > 23:
    h = h % 24
elif n > 59:
    n = n % 60
print(h,' ',n)
a = int(input('a = '))
b = int(input('b = '))
l = int(input('l = '))
n = int(input('n = '))
y = a+(a+b)*(n-2)+2*l
print(y)
a = int(input())
b = int(input())
c = int(input())
if a < b and a < c:
    print(a)
elif b < a and b < c:
    print(b)
if c < a and c < b:
    print(c)
a = int(input('столбец 1ой '))
b = int(input('строка 1ой '))
c = int(input('столбец 2ой '))
d = int(input('строка 2ой '))
if a % 2 == 0 and b % 2 == 0:
    if c % 2 == 0 and d % 2 == 0:    
        print('Да')
if a % 2 == 1 and b % 2 == 1:
    if c % 2 == 1 and d % 2 == 1:
        print('Да')
if a % 2 == 0 and b % 2 == 0:
    if c % 2 == 1 and d % 2 == 1:
        print('Да')
if a % 2 == 1 and b % 2 == 1:
    if c % 2 == 0 and d % 2 == 0:
        print('Да')
if a % 2 == 0 and b % 2 == 1:
    if c % 2 == 0 and d % 2 == 0:
        print('Нет')
if a % 2 == 1 and b % 2 == 0:
    if c % 2 == 0 and d % 2 == 0:
        print('Нет')
if a % 2 == 0 and b % 2 == 0:
    if c % 2 == 1 and d % 2 == 0:
        print('Нет')
if a % 2 == 0 and b % 2 == 0:
    if c % 2 == 0 and d % 2 == 1:
        print('Нет')
if a % 2 == 1 and b % 2 == 0:
    if c % 2 == 1 and d % 2 == 1:
        print('Нет')
if a % 2 == 0 and b % 2 == 1:
    if c % 2 == 1 and d % 2 == 1:
        print('Нет')
if a % 2 == 1 and b % 2 == 1:
    if c % 2 == 0 and d % 2 == 1:
        print('Нет')
if a % 2 == 1 and b % 2 == 1:
    if c % 2 == 1 and d % 2 == 0:
        print('Нет')
if a % 2 == 1 and b % 2 == 0:
    if c % 2 == 1 and d % 2 == 0:
        print('Да')
if a % 2 == 0 and b % 2 == 1:
    if c % 2 == 0 and d % 2 == 1:
        print('Да')
if a % 2 == 1 and b % 2 == 0:
    if c % 2 == 0 and d % 2 == 1:
        print('Да')
if a % 2 == 0 and b % 2 == 1:
    if c % 2 == 1 and d % 2 == 0:
        print('Да')
year = int(input())
if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    print('Да')
else:
    print('Нет')
x = int(input())
y = int(input())
z = int(input())
if x == y != z or y == z != x or x == z != y:
    print('2')
elif x == y == z:
    print('3')
else:
    print('0')
n = int(input())
m = int(input())
k = int(input())
if n * m <= k:
    print('Нет')
elif n * m > k:
    print('Да')

    
