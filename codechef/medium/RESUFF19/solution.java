class Codechef {
    public static void main(String[] args) {
        String password = "mypass123";
        
        // Use a ternary operator to check the password strength
        String strength = password.length()<8 ?"Weak":"Strong";
        
        System.out.println("Password strength: " + strength);
    }
}
