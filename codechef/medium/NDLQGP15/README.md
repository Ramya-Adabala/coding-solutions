# NDLQGP15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Processing User Feedback in a Survey System

In a survey system, users submit feedback in the form of short text responses. These responses may include  **leading or trailing spaces**, inconsistent  **capitalization**, or  **mixed case letters**.

 **Tasks to do:** 

- Trimming any leading and trailing whitespace.
- Printing the cleaned feedback in: All uppercase All lowercase
- Printing the length of the cleaned feedback (after trimming).

 **Expected Output** 

```
GREAT PRODUCT AND SERVICE!
great product and service!
26

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T02:06:06.169Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String feedback = "   Great product and service! ";
        
        // Trim the original string and store as trimmedFeedback
        String trimmedFeedback = feedback.trim();

        // convert trimmedFeedback to upper case and lower case
        String upperCaseFeedback = trimmedFeedback.toUpperCase();
        String lowerCaseFeedback = trimmedFeedback.toLowerCase();
        
        // output the strings
        System.out.println(upperCaseFeedback);
        System.out.println(lowerCaseFeedback);
        System.out.println(trimmedFeedback.length());

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP15)