# Multiply Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

 **Note:**  You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

 **Example 1:** 

```
Input: num1 = "2", num2 = "3"
Output: "6"

```

 **Example 2:** 

```
Input: num1 = "123", num2 = "456"
Output: "56088"

```

 

 **Constraints:** 

- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only.
- Both num1 and num2 do not contain any leading zero, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 79.09%)  
**Memory:** 43.9 MB (beats 14.81%)  
**Submitted:** 2026-08-18T13:07:34.145Z  

```java
class Solution
{
    public String multiply(String num1, String num2)
    {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--)
        {
            for (int j = n2 - 1; j >= 0; j--)
            {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }

        StringBuilder prodstring = new StringBuilder();
        for (int digit : result)
        {
            if (!(prodstring.length() == 0 && digit == 0))
                prodstring.append(digit);
        }

        return prodstring.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/multiply-strings/)