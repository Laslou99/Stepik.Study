a, b = int(input()), int(input())
r = input()
if r == "+":
    print(a + b)
elif r == "-":
    print(a - b)
elif r == "/":
    if b == 0:
        print("На ноль делить нельзя!")
    else:
        print(a / b)
elif r == "*":
    print(a * b)
else:
    print("Неверная операция")
