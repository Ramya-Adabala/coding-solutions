class Codechef {
    public static void main(String[] args) {
        
        String fullName = "John Doe";

        
        char firstInitial = fullName.charAt(0); // Retrieves the first character of the string "fullName", which is 'J' in this case

        
        // The position of the first character of "Doe" is manually determined as index 5
        char lastInitial = fullName.charAt(5); // Retrieves the character at index 5, which is 'D'

       
        System.out.println("Initials: " + firstInitial + lastInitial); // Displays "Initials: JD"
    }
}
