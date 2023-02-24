text = input()
glas = 0
sogl = 0
g = "ауоыиэяюёеАУОЫИЭЯЮЁЕ"
s = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ"

for i in text:
    if i in g:
        glas += 1
    if i in s:
        sogl += 1

print('Количество гласных букв равно', glas)
print('Количество согласных букв равно', sogl)