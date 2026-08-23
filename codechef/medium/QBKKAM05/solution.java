class Codechef {
    public static void main(String[] args) {
        // Step 1: Initialize the person's age
        int age = 15;

        // Step 2: Check if the person has a movie ticket
        boolean hasTicket = true;

        // Step 3: Determine eligibility for movie night (age >= 13 and has a ticket)
       boolean isEligible=age>=13 && hasTicket;
          if(isEligible){
              System.out.println("Age:"+ age);
          

        // Step 4: Print the person's age


        // Step 5: Print whether the person has a ticket

       System.out.println("Has Ticket:"+ hasTicket);
        // Step 6: Print if the person is eligible for movie night
        System.out.println("Is Eligible for Movie Night: " + isEligible);
    }}
}

