t = int(input())

while t > 0:
    a, b, c = map(int, input().split())
    print('YES' if a < b and b < c else 'NO')
    t -= 1
