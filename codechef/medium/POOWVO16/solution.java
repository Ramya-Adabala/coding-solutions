import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        int correctPIN = 1234; // Define the correct PIN
        boolean isVerified = false; // Flag to control the loop

        // Loop continues until the correct PIN is entered
        while (!isVerified) {
            //System.out.print("Enter your 4-digit PIN: ");
            int userPIN = scanner.nextInt(); // Read user input

            // Check if the entered PIN matches the correct PIN
            if (userPIN == correctPIN) {
                isVerified = true; // Set flag to true to exit loop
                System.out.println("Access granted!"); // Display success message
            } else {
                System.out.println("Invalid PIN. Try again."); // Prompt user to re-enter
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}