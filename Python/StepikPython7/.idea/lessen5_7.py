num = int(input())
teg = 'YES'
a = num % 10

while num:
    if a > num % 10:
        teg = 'NO'
    else:
        a = num % 10
    num //= 10
print(teg)