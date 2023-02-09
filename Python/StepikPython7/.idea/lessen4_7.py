mun = int(input())
count=0

while mun > 0:
    if mun >= 25:
        mun-=25
    elif mun >= 10:
        mun-=10
    elif mun >= 5:
        mun-=5
    else:
        mun-=1
    count+=1

print(count)