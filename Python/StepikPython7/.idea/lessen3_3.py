from math import log
diff = 0
n = int(input())
for i in range(1, n + 1):
    diff += (1 / i)
print(diff - log(n))  