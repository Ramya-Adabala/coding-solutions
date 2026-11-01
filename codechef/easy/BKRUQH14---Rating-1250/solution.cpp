class Codechef {
    public static void main(String[] args) {
        // Define variables
        int a = 12, b = 4, c = 2;
        boolean result;

        // Compound logical and relational expression
        result = (a > b) && (b < c) || (a % c == 0); 
        // Evaluates as: (true && false) || true ? false || true ? true

        // Print results
        System.out.println(result); // Output: true
    }
}