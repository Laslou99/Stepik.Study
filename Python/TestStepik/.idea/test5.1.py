year = int(input())
a = (year % 100) // 10
b = (year % 10)
if 1 <= a <= 9 or 1 <= b <= 9:
    print("NO")
elif a == b == 0:
    print("YES")
