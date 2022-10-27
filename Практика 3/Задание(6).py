def Z(a, b, c, d):
    x=a%2
    y=b%2
    z=c%2
    f=d%2
    if x==1 and y==1 and z==1 and f==1:
        print('Yes')
    elif x==1 and y==1 and z==0 and f==0:
        print('Yes')
    elif x==0 and y==0 and z==1 and f==1:
        print('Yes')
    elif x==1 and y==0 and z==1 and f==0:
        print('Yes')
    elif x==0 and y==1 and z==0 and f==1:
        print('Yes')
    elif x==1 and y==1 and z==0 and f==1:
        print('No')
    elif x==1 and y==1 and z==1 and f==0:
        print('No')
    elif x==0 and y==0 and z==1 and f==0:
        print('No')
    elif x==0 and y==0 and z==0 and f==1:
        print('No')
    elif x==1 and y==0 and z==1 and f==1:
        print('No')
    elif x==1 and y==0 and z==0 and f==1:
        print('No')
    elif x==0 and y==1 and z==0 and f==0:
        print('No')
    elif x==1 and y==0 and z==0 and f==1:
        print('Yes')
    else: 
        print('Yes')
print(Z(2, 5, 6, 7))
