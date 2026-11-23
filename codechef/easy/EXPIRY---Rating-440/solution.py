# cook your dish here
for _ in range(int(input())):
    N, M, K = map(int, input().split())
    if M * K >= N:
        print("Yes")
    else:
        print("No")