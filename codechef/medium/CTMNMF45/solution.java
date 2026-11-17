import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input
        
        int limit = scanner.nextInt(); // Take user input for the upper limit
        
        int sum = 0; // Variable to store the sum of squares
        int num = 1; // Start number from 1

        // Iterate from 1 to the given limit
        while (num <= limit) {
            if (num % 10 == 5) { // Skip numbers ending with 5
                num++; // Move to the next number
                continue; // Skip further processing for this number
            }
            sum += (num * num); // Add square of the number to sum
            num++; // Increment to next number
        }

        // Print the final sum
        System.out.println("Sum of squares (excluding numbers ending with 5): " + sum);
        
        scanner.close(); // Close the scanner
    }
}
