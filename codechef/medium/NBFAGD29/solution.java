class Codechef {
    public static void main(String[] args) {
        int maxWeight = 20;  // Maximum allowed luggage weight (kg)
        int passengerLuggage = 18; // Passenger's luggage weight

        // Write code to compare and print result in given format
        boolean isAllowed=passengerLuggage<=maxWeight;
        System.out.println("Is the luggage within the allowed weight?"+isAllowed);
    }
}
