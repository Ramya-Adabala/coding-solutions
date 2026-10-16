# NCOPIES - Rating 1745

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Copy and Paste

Chef has binary string $A$ of length $N$. He constructs a new binary string $B$ by concatenating $M$ copies of $A$ together. For example, if $A = \texttt{"10010"}$, $M = 3$, then $B = \texttt{"100101001010010"}$.

Chef calls an index $i$ $(1 \le i \le N \cdot M)$  *good*  if:

- $pref_i = suf_{i + 1}$.

Here, $pref_j = B_1 + B_2 + \ldots + B_j$ and $suf_j = B_{j} + B_{j + 1} + \ldots + B_{N \cdot M}$ (Note that $suf_{N \cdot M + 1} = 0$ by definition)

Chef wants to find the number of good indices in $B$. Can you help him do so?

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first line of each test case contains two space-separated integers $N$ and $M$ — the length of the binary string $A$ and the number of times $A$ is concatenated to form $B$.
- The second line of each test case contains a binary string $A$ of length $N$ containing $0$s and $1$s only.
### Output Format

For each test case, output the number of good indices in $B$.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N, M \leq 10^5$
- $A$ is a binary string, i.e, contains only the characters $0$ and $1$.
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
- The sum of $M$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
2 2
00
2 4
11
3 3
101

```

```
4
1
2

```

### Explanation:

 **Test case $1$:**  $B = \texttt{"0000"}$. In this string, all the indices are good.

 **Test case $2$:**  $B = \texttt{"11111111"}$. In this string, only $i = 4$ is good.

 **Test case $3$:**  $B = \texttt{"101101101"}$. In this string, $i = 4$ and $i = 5$ are good.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T12:11:15.558Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (line == null) break;

            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            String a = br.readLine().trim();

            ArrayList<Integer> onePositions = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    onePositions.add(i);
                }
            }

            long k = onePositions.size();

            // Case 1: All zeros
            if (k == 0) {
                sb.append(n * m).append("\n");
                continue;
            }

            // Case 2: Total ones is odd
            if ((k * m) % 2 != 0) {
                sb.append(0).append("\n");
                continue;
            }

            long target = (k * m) / 2;
            long r = target % k;

            if (r == 0) {
                // Split occurs between two full copies
                int firstOne = onePositions.get(0);
                int lastOne = onePositions.get((int) k - 1);
                long leadingZeros = firstOne;
                long trailingZeros = n - 1 - lastOne;

                sb.append(leadingZeros + trailingZeros + 1).append("\n");
            } else {
                // Split occurs inside a copy
                int idx1 = onePositions.get((int) r - 1);
                int idx2 = onePositions.get((int) r);

                sb.append(idx2 - idx1).append("\n");
            }
        }

        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NCOPIES)