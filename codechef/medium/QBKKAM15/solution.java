class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the variable 'marks' to store the student's score
        int marks = 40;

        // Step 2: Use the NOT operator (!) to check if the student did NOT pass
        // The condition (marks >= 50) checks if the marks are 50 or above (passing condition)
        // The NOT operator negates this condition, checking if the student did not pass
         boolean notPass=!(marks>=50);

        // Step 3: Print the result indicating whether the student did NOT pass
 System.out.println("Did the student NOT pass? " + notPass);
    }
}
