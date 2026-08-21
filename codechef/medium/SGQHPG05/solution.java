class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial reward points, bonus points, and expired points
        int rewardPoints = 120, bonusPoints = 30, expiredPoints = 10;

        // Adjust reward points by adding bonus and subtracting expired points
rewardPoints += bonusPoints;
        rewardPoints -= expiredPoints;


        // Print reward points before post-increment
        System.out.println("Reward Points before post-increment "+rewardPoints);  // Prints updated reward points before increment

        // Apply post-increment to update the total points
        rewardPoints++;

        // Print updated reward points after incrementing
        System.out.println("Reward Points after post-increment "+rewardPoints++);
    }
}
