#Try and debug this code to solve the problem!!!

t = int(input())
for i in range(t):
    A, B, C = map(int, input().split())
    maximum = max(A,B,C)
    minimum = min(A,B,C)
    D = maximum - minimum
    print(D)
    