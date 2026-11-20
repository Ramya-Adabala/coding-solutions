# The code below is incorrect. Debug this code to solve this problem

t=int(input())
for i in range(t):
    A, B, C = map(int,input().split())
    total_score = A + B + C
    minimum_score = min(A,B,C)
    if total_score>=100 and minimum_score>=10:
        print('PASS')
    else:
        print('FAIL')