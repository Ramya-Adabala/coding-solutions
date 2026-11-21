#Update the code below to solve this problem

#Note this line has been commented out there is no 't'
#t = int(input())   

X = int(input())
A,B = map(int, input().split())
if(A+B)<=X:
    print("Yes")
else:
    print("No")
