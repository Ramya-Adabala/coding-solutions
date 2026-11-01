class Codechef {
    public static void main(String[] args) {
        int maxWeight = 20;  // Maximum allowed luggage weight (kg)
        int passengerLuggage = 18; // Passenger's luggage weight

        boolean isAllowed = passengerLuggage <= maxWeight; // Check if luggage is within limit

        System.out.println("Is the luggage within the allowed weight? " + isAllowed);
    }
}