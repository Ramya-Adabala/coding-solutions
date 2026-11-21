#The code below is incorrect. Debug this code to solve the problem

t = int(input())
for i in range(t):
    N,X,K = map(int,input().split())
    if(N*X <= K):
        print("YES")
    else:
        print("NO")