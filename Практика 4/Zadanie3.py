def F(a,b):
    if a > b:
        if a % 2 == 1:
            print(a)
        while a>=b:
            a=a-1
            if a % 2 == 1:
                print(a)               
F(7,7)
