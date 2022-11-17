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

A=a[0][0]*a[1][0]*a[2][0]
B=a[0][1]*a[1][1]*a[2][1]
C=a[0][2]*a[1][2]*a[2][2]

print()
print('Произведение первого столбца',A)
print('Произведение второго столбца',B)
print('Произведение третьего столбца',C)
print()
if B > A < C:
    print(a[0][1],a[0][0],a[0][2])
    print(a[1][1],a[1][0],a[1][2])
    print(a[2][1],a[2][0],a[2][2])
elif A > B < C:
    print(a[0][0],a[0][2],a[0][1])
    print(a[1][0],a[1][2],a[1][1])
    print(a[2][0],a[2][2],a[2][1])
elif A > C < B:
    print(a[0][2],a[0][1],a[0][0])
    print(a[1][2],a[1][1],a[1][0])
    print(a[2][2],a[2][1],a[2][0])
  

      
