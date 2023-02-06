n = int(input())
s = 0
for i in range(1, n + 1):
    t = i ** 2
    if t % 10 == 2 or t % 10 == 5 or t % 10 == 8:
        s += i
print(s)