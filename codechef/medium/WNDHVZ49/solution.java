import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Predefined emergency access codes
        int emergencyKeycode = 4321;
        int overrideCode = 9999;

        // Take user input
        Scanner sc=new Scanner(System.in);
       
        int code=sc.nextInt();
        


        // Checking if the entered code matches either emergencyKeycode or overrideCode
        if ( emergencyKeycode==code || overrideCode==code ) {  // Fill in the blanks
            System.out.println("Access Granted: Emergency Entry Allowed. "); // Fill in the blank
        } else {
            System.out.println("Access Denied: Invalid Code."); // Fill in the blank
        }


    }
}
