class Codechef {
    public static void main(String[] args) {
        // Boiling point of water in Celsius
        final int BOILING_POINT = 100;
        
        // Current water temperature (you can change this value to test)
        int waterTemperature = 105;
        
        // Check if water is boiling
        boolean isBoiling = waterTemperature > BOILING_POINT;
        
        // Print the result
        System.out.println("Water temperature: " + waterTemperature + "°C");
        System.out.println("Boiling point: " + BOILING_POINT + "°C");
        System.out.println("Is the water boiling? " + isBoiling);
    }
}
