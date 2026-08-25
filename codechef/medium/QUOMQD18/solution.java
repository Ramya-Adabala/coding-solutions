class Codechef {
    public static void main(String[] args) {
        
        // The string is in the format "YYYY-MM-DD", where YYYY is the year, MM is the month, and DD is the day
        String date = "2025-03-11";

        
        // Use the substring() method to extract characters from index 0 (inclusive) to index 4 (exclusive)
        // This effectively retrieves the first 4 characters of the string, which represent the year
        String year = date.substring(0, 4);

      
        // Display the year to the console for verification or further use
        System.out.println("Year: " + year);
    }
}
