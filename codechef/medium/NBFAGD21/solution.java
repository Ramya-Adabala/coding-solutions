class Codechef {
    public static void main(String[] args) {
        int lowBatteryLevel = 20;  // Minimum battery level
        int currentBattery = 15;   // Current battery percentage
        
        boolean isBatterLow = currentBattery < lowBatteryLevel;
        System.out.println("Battery low? " + isBatterLow);
    }
}