# UFTZHO03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked example - this keyword
- Check this worked example to solidify your understanding of the this keyword. A Cuboid class is given with three instance variables: length, width, and height.
- Parameters for the constructor also have the same names, so we are using the this keyword to resolve ambiguity.
- Click the Submit button to see the complete solution and the expected output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T13:19:20.229Z  

```java
class Cuboid {
    int length;
    int width;
    int height;

    // Constructor using 'this' keyword to resolve ambiguity
    Cuboid(int length, int width, int height) {
        this.length = length;  // 'this.length' refers to instance variable while length to parameter
        this.width = width;    // 'this.width' refers to instance variable while width to parameter
        this.height = height;  // 'this.height' refers to instance variable while height to parameter
    }

    // Method to display values
    void area() {
        int area = 2*(length*width+width*height+height*length);
        System.out.println("Area of cuboid: " + area);
    }
    void volume() {
        int volume = length*width*height;
        System.out.println("Volume of cuboid: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Cuboid object
        Cuboid c = new Cuboid(10, 5, 3);

        // Display area and volume of cuboid
        c.area();
        c.volume();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/UFTZHO03)