class Codechef {
    public static void main(String[] args) {
        // Step 1: Define a variable to check if it is Saturday
        boolean isSaturday = true;

        // Step 2: Define a variable to check if it is Sunday
        boolean isSunday = false;

        // Step 3: Use the OR operator to determine if it is the weekend
        boolean isWeekend = isSaturday || isSunday;

        // Step 4: Print the result to indicate if it is the weekend
        System.out.println("Is it the weekend? " + isWeekend); // Output: true
    }
}
