a = int(input())
b = 0
while a != 0:
    next = int(input())
    if next != 0 and a < next:
        b += 1
    a = next
print(b)
