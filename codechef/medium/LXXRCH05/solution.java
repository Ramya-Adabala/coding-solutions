class MovieTicket {
    // Instance variables
    String movieName;
    double ticketPrice;

    // Default constructor: sets a predefined movie and price
    MovieTicket() {
        movieName = "Minions";
        ticketPrice = 250.0;
    }

    // Method to display ticket details and category
    void showInfo() {
        System.out.println("Movie: " + movieName);
        System.out.println("Price: ₹" + ticketPrice);

        // Determine and print the ticket category
        if (ticketPrice > 300) {
            System.out.println("Category: Premium");
        } else {
            System.out.println("Category: Regular");
        }
        System.out.println(); // Blank line for readability
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two MovieTicket objects
        MovieTicket ticket1 = new MovieTicket(); // Uses default values
        MovieTicket ticket2 = new MovieTicket(); 

        // Update the second ticket’s details
        ticket2.movieName = "Interstellar";
        ticket2.ticketPrice = 350.0;

        // Display information for both tickets
        System.out.println("Ticket 1:");
        ticket1.showInfo();

        System.out.println("Ticket 2:");
        ticket2.showInfo();
    }
}