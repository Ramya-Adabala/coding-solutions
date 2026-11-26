# Solution as follows

t = int(input())            
for i in range(t):          
    X, Y, Z = map(int, input().split())
    
    #Borrow the template from our sub-component
    if (Z%X == 0) and (Z%Y == 0):   
        print('ANY')
    elif (Z%X == 0):
        print('CHICKEN')
    elif (Z%Y == 0):
        print('DUCK')
    else:
        print('NONE')
