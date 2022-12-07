def f(n,x):
    if n == 0:
        return x
    else:
        return f(n-1, (x+(n)))
print(f(11,0))
