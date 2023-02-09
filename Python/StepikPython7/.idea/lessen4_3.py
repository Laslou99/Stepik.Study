n = 0
a = input()
while a not in ("стоп", "хватит", "достаточно"):
    n += 1
    a = input()
print(n)