def F(n):    
    h = n % (60 * 24) // 60
    m = n % 60
    print(h, ":", m)
print(F(3245233))
