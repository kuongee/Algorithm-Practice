# How many ways to change coin for N원?

* Problem: Programmers Level3. 거스름돈

```
EX) N = 5, Coin type = [1, 2, 5]
Make N with given coins.
i\n| 1  2  3  4  5
-------------------
 1 | 1  1  1  1  1
     ↓  ↓  ↓  ↓  ↓
the ways to make n with previous coins(i-1) 
        + the ways to make n with coin i
--> dp[n] + dp[n-coin[i]]
 2 | 1  2  2  3  3  
        ↓        ↓
    (1+dp[2-2])  (1+dp[5-2])
 5 | 1  2  2  3  4
                 ↓
            (3+dp[5-5])
```

* Reference: https://algorithms.tutorialhorizon.com/dynamic-programming-coin-change-problem/