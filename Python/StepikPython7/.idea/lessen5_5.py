n = int(input())
count = 0

while n > 9:
    count = n % 10
    n = n // 10
print(count)