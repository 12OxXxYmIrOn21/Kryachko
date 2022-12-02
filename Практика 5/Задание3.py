def F(n):
    i = 1
    while 2**i <= n:
        i += 1
        print(i-1, 2**(i-1))
F(6)
