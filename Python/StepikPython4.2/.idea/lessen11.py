a, b, c = int(input()), int(input()), int(input())
if (b < a < c) or (c < a < b):
    print(a)
elif (c < b < a) or (a < b < c):
    print(b)
else:
    print(c)