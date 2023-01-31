a = int(input())
a1 = a // 100
a2 = a % 100 // 10
a3 = a % 10
if a1 + a2 + a3 == 2 * max(a1, a2, a3):
    print("Число интересное")
else:
    print("Число неинтересное")