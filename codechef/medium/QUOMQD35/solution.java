class Codechef {
    public static void main(String[] args) {
        // Define a string
        String text = "This is a simple example.";

        // Find the last space in the string
                int lastIndexOfSpace=text.lastIndexOf(" ");

        // Extract the last word
    String lastWord=text.substring(lastIndexOfSpace +1);

        // Print the result
System.out.println("The last word is: "+lastWord);
    }
}
