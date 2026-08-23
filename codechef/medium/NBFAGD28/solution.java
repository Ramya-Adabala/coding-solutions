class Codechef {
    public static void main(String[] args) {
        int speedLimit = 60;  // Maximum allowed speed
        int vehicleSpeed = 55; // Current vehicle speed

        boolean isWithinLimit = vehicleSpeed <= speedLimit; // Check if within speed limit

        System.out.println("Is the vehicle within the speed limit? " + isWithinLimit);
    }
}
