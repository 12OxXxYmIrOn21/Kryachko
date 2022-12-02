def F():
    k = int(input())
    ix = int(input())
    y = 0
    while ix != 0:
        if ix == k:
            y += 1
        k = ix
        ix = int(input())    
    print(y)
F()
