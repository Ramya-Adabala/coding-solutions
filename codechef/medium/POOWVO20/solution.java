import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the range of odd number addition tables
        int start = scanner.nextInt();  // Starting odd number
        int end = scanner.nextInt();    // Ending odd number
        int limit = scanner.nextInt();  // Maximum number for addition


        // Outer loop for generating tables from 'start' to 'end'
         
        while (start <= end) {
            if (start % 2 != 0) { // Process only odd numbers
                System.out.println("Addition Table for " + start + ":");

                // Inner loop for printing addition results up to 'limit'
                int addend = 1;
                while (addend <= limit) {
                    System.out.println(start + " + " + addend + " = " + (start + addend));
                    addend++; // Move to the next addition step
                }
            }
            start++; // Move to the next number
        }
        

        scanner.close(); // Close the scanner
    }
}
