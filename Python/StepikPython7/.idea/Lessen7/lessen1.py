n = int(input())
count = 0
for x in range(1, n + 1):
    for y in range(x):
        count += 1
        print(count, end=" ")
    print()