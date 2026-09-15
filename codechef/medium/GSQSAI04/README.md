# GSQSAI04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### strftime function

Listen

Until now, we learned how to manipulate date and time separately. Let's learn how to manipulate the date and time in a combined format with the help of the STRFTIME() function.

 **STRFTIME()** : This function used to format date and time values.
 **Syntax** : STRFTIME(FORMAT, TIMESTRING, [MODIFIER1, MODIFIER2,...])
 **Formatting codes** :

```
┌───────────┬───────────┬───────────────────────────────────────────┐
│ Value     │ Format    │  Example                                  │
├───────────┼───────────┼───────────────────────────────────────────┤
│ Year      │ '%Y'      │  strftime('%Y','2024-11-07')              │
│ Month     │ '%m'      │  strftime('%m','2024-12-11 20:55:59')     │
│ Day       │ '%d'      │  strftime('%d','1990-12-14')              │
│ Hour      │ '%H'      │  strftime('%H','12:45:57')                │
│ Minute    │ '%M'      │  strftime('%M','2024-11-07 23:33:48')     │
│ Second    │ '%S'      │  strftime('%S','15:05:34')                │  
└───────────┴───────────┴───────────────────────────────────────────┘  

```

- Timestring : This can be in various date formats, such as "YYYY-MM-DD", "YYYY-MM-DD HH:MM:SS", or NOW for the current date and time.
- Modifier : modifiers can be optional, which can adjust the date or time, such as adding days, subtracting months, etc.

To get the date ('%Y-%m-%d') of 1 month from now, either of the following syntax is used:

```
  SELECT STRFTIME('%Y-%m-%d','NOW','+1 MONTH');

```

or

```
  SELECT STRFTIME('%Y-%m-%d',CURRENT_DATE,'+1 MONTH');

```

To get the minutes('%M') of CURRENT_TIME, either of the following syntax is used:

```
  SELECT STRFTIME('%M','NOW');

```

or

```
  SELECT STRFTIME('%M',CURRENT_TIME);

```

### Task
- Write a query which outputs the '%Y-%m-%d %H:%M:%S' format of 10 days from '2023-04-20 13:40:23'.
- Write a query which outputs the '%d' format of '2024-03-04 23:34:20'.

```
Expected output
2023-04-30 13:40:23
04

```

Code it out in the IDE.

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T04:11:57.955Z  

```sql
/* Solution as follows */

SELECT STRFTIME('%Y-%m-%d %H:%M:%S','2023-04-20 13:40:23','+10 days');
SELECT STRFTIME('%d','2024-03-04 23:34:20');
```

---

[View on CodeChef](https://www.codechef.com/problems/GSQSAI04)