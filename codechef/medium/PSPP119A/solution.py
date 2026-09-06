# Solution as follows

A = [1, 2, 3, 1, 2, 4, 1, 3, 5]
A_freq = {}

for i in A:
    if i in A_freq:
        A_freq[i] = A_freq[i] + 1
    else:
        A_freq[i] = 1
        
print(A_freq)