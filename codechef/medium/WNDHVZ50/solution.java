import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for delivery conditions
        boolean city=sc.nextBoolean();
        int order=sc.nextInt();


        // Checking eligibility for same-day delivery
  if(city || order<14){
      System.out.println("Package qualifies for same-day delivery.");
  }
  else{
      System.out.println("Package does not qualify for same-day delivery.");
  }




    }
}
