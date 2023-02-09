inputn = int(input())
n = inputn
total = 0
product = 1
count = 0

while inputn != 0:
    total += inputn % 10
    product *= inputn % 10
    count += 1
    inputn //= 10

print(total)
print(count)
print(product)
print(total/count)
print(n//10 ** (count-1))
print(n//10 ** (count-1) + n%10)