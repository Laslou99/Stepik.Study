n = int(input())
m = int(input())

if n < m:
    for i in range(n, m + 1):
        print(i)
else:
    for i in range(n, m - 1, -1):
        print(i)