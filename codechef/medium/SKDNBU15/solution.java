class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial fuel level and fuel consumed
        float fuelLevel = 45.5f, fuelConsumed = 12.3f;

        // Subtract the fuel consumed using -=
        fuelLevel -= fuelConsumed;

        // Print the updated fuel level
        System.out.println(fuelLevel);  // Prints the remaining fuel level
    }
}
