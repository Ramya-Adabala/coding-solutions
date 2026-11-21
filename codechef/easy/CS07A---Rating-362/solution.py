# Solution as follows

#Note this line has been commented out there is no 't' in this problem
#t = int(input())           

#Accept 2 integers as input
X,Y = map(int, input().split())   
#Primary condition 1 as per the problem statement 
if X >= 2*Y:                    
    print('Yes')
else:
    print('No')

