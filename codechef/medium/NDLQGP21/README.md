# NDLQGP21

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T02:11:04.828Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a secret message
        String secretMessage = "Access Denied. Try Again!";

        // Encrypt the message by replacing characters with codes
        String encryptedMessage=secretMessage.replace('A','@')
                                    .replace('a','6')
                                    .replace('e','3')
                                    .replace('i','!');





       
        // Print the original message
        System.out.println("Original Message: [" + secretMessage + "]");
        
        // Print the encrypted message
        System.out.println("Encrypted Message: [" + encryptedMessage + "]");

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP21)