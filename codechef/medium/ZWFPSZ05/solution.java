// Importing the Scanner class from the java.util package
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the keyboard (System.in)
        Scanner sc = new Scanner(System.in);

        // Reading two integers from the user directly and adding them
        // Displaying the result of the addition
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum is: "+(a+b));


        // Closing the Scanner object to release resources and avoid memory leaks
        sc.close();

    }
}
