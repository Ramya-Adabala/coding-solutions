import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        int number; // Declare a variable to store the user input

        // Infinite loop to repeatedly prompt user for input
        while(true){
            number=sc.nextInt();
            if(number%5==0 && number%3==0){
                break;
            }
            else{
                System.out.println("Invalid input! Enter a number divisible by both 3 and 5.");
            }
        }








        // Print the valid number that satisfies the condition
        System.out.println("Valid input! " + number + " is divisible by both 3 and 5.");
        
        sc.close(); // Close the scanner to free system resources
    }
}