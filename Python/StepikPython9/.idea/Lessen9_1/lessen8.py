n = input()
sum = 0
star = 0
for i in n:
    if i == "+":
        sum += 1
    elif i == "*":
        star += 1

print("Символ + встречается", sum, "раз")
print("Символ * встречается", star, "раз")