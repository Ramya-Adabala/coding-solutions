class Codechef {
    public static void main(String[] args) {
        
        String description = "This shirt is available in multiple colours.";
        
        String updatedDescription = description.replace("colour", "color");


        String finalDescription = updatedDescription.toUpperCase();


        System.out.println(finalDescription);
    }
}