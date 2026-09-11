#Try and debug this code to solve the problem!!!

t = int(input())
for i in range(t):
    X, Y, Z = map(int, input().split())
    Total_Credits = 4*X + 2*Y + 0*Z
    print(Total_Credits)