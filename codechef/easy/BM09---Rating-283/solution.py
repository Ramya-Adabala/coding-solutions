# Update the '_' in the code below to solve the problem

t = int(input())                
for i in range(t):              
    #Accept 2 integers inputs.
    N, M = map(int,input().split())         
    #Declare a new variable to store the 5 seater capacity
    five_seat_capacity = N*5   
    #Declare a new variable to store the 7 seater capacity
    seven_seat_capacity = M*7   
    #Print the desired output for each test case
    print(five_seat_capacity+seven_seat_capacity)                  