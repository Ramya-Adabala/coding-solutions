# LB03 - Rating 680

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem(High Accuracy)- Solve the complete problem

There are $100$ questions in a paper.

- Each question carries +3 marks for correct answer,
- -1 marks for incorrect answer i.e. one mark is deducted for each incorrect answer,
- 0 marks for an unattempted question.

It is given that Chef received exactly $X$ $(0 \leq X \leq 100)$ marks.
Determine the  **minimum**  number of problems Chef marked  **incorrect**.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each testcase contains of a single integer $X$, marks that Chef received.
### Output Format

For each test case, output the  **minimum**  number of problems Chef marked incorrect.

### Sample 1:
Input
Output

```
4
0
100
32
18

```

```
0
2
1
0

```

### Explanation:

 **Test Case $1$:**  It might be possible that Chef didn't attempt any question in which case he didn't get any question incorrect.

 **Test Case $2$:**  For the case when Chef got $34$ questions correct and $2$ questions incorrect, Chef marked minimum incorrect questions.

 **Test Case $3$:**  For the case when Chef got $11$ questions correct and $1$ question incorrect, Chef marked minimum incorrect questions.

 **Test Case $4$:**  For the case when Chef got $6$ questions correct and no question incorrect, Chef marked minimum incorrect questions.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T00:16:31.926Z  

```py
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

```

---

[View on CodeChef](https://www.codechef.com/problems/LB03)