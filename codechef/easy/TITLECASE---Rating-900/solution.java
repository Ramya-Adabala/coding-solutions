import java.util.Scanner;

class CodeChef {
    public static String toTitleCase(String input) {
        String[] words = input.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) continue;

            // Check if the word is an acronym (all uppercase characters)
            boolean isAcronym = true;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isUpperCase(word.charAt(i))) {
                    isAcronym = false;
                    break;
                }
            }

            if (isAcronym) {
                titleCase.append(word);
            } else {
                // Capitalize first character, lowercase the remainder
                titleCase.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    titleCase.append(word.substring(1).toLowerCase());
                }
            }
            titleCase.append(" ");
        }

        return titleCase.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0 && scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(toTitleCase(input));
        }

        scanner.close();
    }
}