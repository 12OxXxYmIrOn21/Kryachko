def F(n):
    p_fact = 1
    p_sum = 0
    for i in range(1, n + 1):
        p_fact *= i
        p_sum += p_fact
    print(p_sum)
F(5)
