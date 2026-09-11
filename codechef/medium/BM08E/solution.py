# Update the '_' below to solve the problem

t = int(input())
for i in range(t):
    N, A = map(int, input().split())
    chef_chocolates = A
    chefina_chocolates = N-A
    diff = abs(chefina_chocolates - chef_chocolates)
    print(diff)