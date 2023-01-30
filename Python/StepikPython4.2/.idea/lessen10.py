x, y, z = int(input()), int(input()), int(input())
if (x == y != z) or (x == z != y) or (x != y == z):
    print("Равнобедренный")
elif x == y == z:
    print("Равносторонний")
else:
    print("Разносторонний")