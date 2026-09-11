# Update the blanks in the code below to solve the problem

t = int(input())
for i in range(t):
    A, B = map(int, input().split())
    print(A//B, A%B)