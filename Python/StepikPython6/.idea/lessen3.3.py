import math

a, b = float(input()), float(input())

x1 = (a + b) / 2
x2 = math.sqrt(a * b)
x3 = (2 * a * b) / (a + b)
x4 = math.sqrt(((a ** 2) + (b ** 2)) / 2)

print(x1)
print(x2)
print(x3)
print(x4)