import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int weatherCode = scanner.nextInt(); //User Input 

        // Switch statement to determine the weather condition
        switch (weatherCode) {
            case 1: // Case for Sunny
                System.out.println("It's sunny! Wear light clothes and don't forget sunscreen.");
                break; // Exit the switch statement after executing this case

            case 2: // Case for Rainy
                System.out.println("It's rainy! Bring an umbrella and wear waterproof clothes.");
                break; // Exit the switch statement after executing this case

            case 3: // Case for Snowy
                System.out.println("It's snowy! Wear warm layers and snow boots.");
                break; // Exit the switch statement after executing this case

            case 4: // Case for Windy
                System.out.println("It's windy! Wear a windbreaker and avoid loose clothing.");
                break; // Exit the switch statement after executing this case

            default: // Case for invalid weather condition code
                System.out.println("Invalid weather condition code. Please enter 1, 2, 3, or 4.");
                break; // Exit the switch statement
        }
    }
}
