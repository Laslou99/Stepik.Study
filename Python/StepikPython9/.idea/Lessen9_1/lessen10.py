text = input()
glas = 0
sogl = 0
for i in range(len(str(n))):
    if n[i] in "ауоыиэяюёе":
        glas += 1
        break
    elif n[i] in "бвгджзйклмнпрстфхцчшщ":
        sogl += 1
        break
print("Количество гласных букв равно", glas)
print("Количество согласных букв равно", sogl)