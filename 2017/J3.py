import sys
a, b = map(int, input().split())
c, d = map(int, input().split())
t = int(input())

shortest = abs(a-c) + abs(b-d)
if t < shortest:
    print("N")
elif t == shortest:
    print("Y")
else:
    if shortest % 2 == 0:
        if t % 2 == 0:
            print("Y")
        else:
            print("N")

    else:
        if t % 2 == 1:
            print("Y")
        else:
            print("N")