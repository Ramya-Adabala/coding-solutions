// This class demonstrates the use of statements and semicolons in Java.
class Codechef {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // Flight details
        String flightStatus1 = "On Time";
        String flightStatus2 = "Delayed";
        int flightNumber = 1023;
        double flightDuration = 2.5;

        // Complete the below code
        boolean statusMatch = flightStatus1.equals(flightStatus2);
        System.out.println("Flight Number: "+ flightNumber);
        System.out.println("Flight Duration: "+flightDuration + "hours");
        System.out.println("Flight status match: "+statusMatch);
    }
}