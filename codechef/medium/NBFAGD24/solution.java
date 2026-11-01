class Codechef {
    public static void main(String[] args) {
        int legalAge = 18;  // Minimum age to vote
        int personAge = 20; // Age of the person

        boolean canVote = personAge >= legalAge; // Store result in variable

        System.out.println("Is the person eligible to vote? " + canVote);
    }
}