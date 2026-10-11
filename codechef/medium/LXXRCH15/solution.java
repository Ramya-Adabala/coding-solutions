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