def f():
    x = int(input())
    if x == 0:
        return int()
    return max([x, f()])
print(f())
