def F(n):
    s = 1
    for i in range(1, n + 1):
        s += s * i
    print(s)
F(5)    
