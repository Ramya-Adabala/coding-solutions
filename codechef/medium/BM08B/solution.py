# Update the '_' in the code below to solve this problem

t = int(input())
for i in range(t):
    A, B = map(int, input().split())
    print((A - B), (B - A), abs(A - B), abs(B- A))
    