class Codechef {
    public static void main(String[] args) {
        // Step 1: Define a boolean variable to indicate if the door is locked
        boolean isDoorLocked = true;

        // Step 2: Use the NOT operator (!) to reverse the value of isDoorLocked
        // This checks if the door is unlocked
        boolean isDoorUnlocked = !isDoorLocked;

        // Step 3: Print the result to indicate whether the door is unlocked
        System.out.println("Is the door unlocked? " + isDoorUnlocked); // Output: false
    }
}
