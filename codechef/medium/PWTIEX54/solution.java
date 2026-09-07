class Codechef {
    // Static variable
    static int count = 0;  // Initialize count to 0

    // Static method
    public static void increment() {
        count++;  // Static method to increment the count
    }

    // Static block
    static {
        count=10;  // Initialize count to 10
    }

    public static void main(String[] args) {
        // Calling the static method
        Codechef.increment();  // Fill in the missing method call code to increment count
        
        // Printing the static variable
        System.out.println("Count: " + count);
    }
}
