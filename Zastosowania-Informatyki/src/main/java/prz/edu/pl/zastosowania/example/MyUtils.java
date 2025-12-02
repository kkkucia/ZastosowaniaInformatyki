package prz.edu.pl.zastosowania.example;


public class MyUtils {

    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) return text;

        String[] parts = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : parts) {
            if (!word.isEmpty()) {
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(capitalized).append(" ");
            }
        }
        return result.toString().trim();
    }
}
