# Solution as follows

t = int(input())            
for i in range(t):          
    X = int(input())
    
    #Borrow the template from the sub-component, replace the relevant output
    if X%3 == 0:        
        print(0)        
    elif (X+1)%3 == 0:
        print(1)
    else:
        print(2)
