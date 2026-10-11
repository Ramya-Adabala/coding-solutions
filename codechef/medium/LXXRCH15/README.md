# LXXRCH15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rectangle Area Calculator using Constructor
- Write a Java program that reads the dimensions of a rectangle from the user and calculates its area.
- Your task is to define a Rectangle class that stores the rectangle's length and width. Use a parameterized constructor to initialize these values at the time of object creation. Then, implement a method named calculateArea() that computes and returns the area. Finally, display the area in the main method.

 **Input:** 
Two `double` values representing the  **length**  and  **width**  of the rectangle.

### Sample 1:
Input
Output

```
10.0
20.0
```

```
Rectangle Area: 200.0
```

### Sample 2:
Input
Output

```
13.0
14.0
```

```
Rectangle Area: 182.0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T14:25:28.536Z  

```java
import java.util.Scanner;

class Rectangle {
    // Declare instance variable to store length of the rectangle
    double length;
    // Declare instance variable to store width of the rectangle
    double width;

    // Parameterized constructor to initialize length and width
    public Rectangle(double rectLength, double rectWidth) {
        // Assign the constructor parameter rectLength to the instance variable length
        length = rectLength;
        // Assign the constructor parameter rectWidth to the instance variable width
        width = rectWidth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        
        // Calculate and return the area of Rectangle
        double area = length*width;
        return area;
        
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the length of the rectangle from user input
        double len = scanner.nextDouble();
        
        // Read the width of the rectangle from user input
        double wid = scanner.nextDouble();
        
        // Create a Rectangle object using the user-provided dimensions
        Rectangle myRectangle = new Rectangle(len, wid);

        // Call the calculateArea method and store the result in the variable area
        double area = myRectangle.calculateArea();
        
        // Print the calculated area of the rectangle to the console
        System.out.println("Rectangle Area: " + area);
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LXXRCH15)