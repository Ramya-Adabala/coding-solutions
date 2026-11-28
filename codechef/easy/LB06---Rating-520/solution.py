# Solution as follows

t = int(input())
for i in range(t):
    N, X = map(int,input().split())
    
    #Borrow the template from the sub-problem
    option1 = X         
    option2 = N-X
    print(min(option1,option2))