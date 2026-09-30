# Read the number of test cases
t = int(input())

for _ in range(t):
    # Read Alice's score (a) and Bob's score (b)
    a, b = map(int, input().split())
    
    
    print(min(7 - a, 7 - b))