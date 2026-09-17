import java.util.*;

class Codechef {

    // Declare instance variables for length and width
    double length;
    double width;

    // Parameterized constructor to initialize length and width
    public Codechef(double len, double wid) {
        length = len;
        width = wid;
    }

    // Method to calculate and display the area of the rectangle
    public void displayArea() {
        double area = length * width;  // Formula to calculate area of rectangle
        System.out.println("Rectangle Area: " + area);  // Print the area
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input for length and width
        double length=sc.nextDouble();
        double width=sc.nextDouble();
        


        
        // Create an object of Codechef class using the parameterized constructor\
        Codechef cc=new Codechef(length,width);

        
        // Call the displayArea method to display the area of the rectangle

        cc.displayArea();
        sc.close();
    }
}

