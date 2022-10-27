def f(x):               
    if (x//4==0) and (x//100!=0) and (x//400!=0):
        print("Yes")
    else:
        print("No")
print(f(2022))
