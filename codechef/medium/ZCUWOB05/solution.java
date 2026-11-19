import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int multipleOf = sc.nextInt();
         
        // For loop with range from 1 to 10
        for (int i = 1; i <= 10; i++) { 
            
            if (i % multipleOf == 0) { // Check if i is a multipleof the given number
                System.out.println(i); // Print the multiple
            }
        }
        sc.close();
    }
}
