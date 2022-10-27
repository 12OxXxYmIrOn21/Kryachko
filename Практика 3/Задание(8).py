def f(a, b, c):         
    if a == b == c:
        return 3
    if (a == c) or (b == c) or (b == a):
        return 2
    else:
        return 0
print(f(3, 4, 35))
