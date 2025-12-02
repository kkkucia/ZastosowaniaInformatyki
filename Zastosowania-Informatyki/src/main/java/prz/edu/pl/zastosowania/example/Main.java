package prz.edu.pl.zastosowania.example;

import static prz.edu.pl.zastosowania.example.MyUtils.capitalize;

public class Main {
    public static void main(String[] args) {

        String text = "hello world from java!";

        System.out.println("Original:    " + text);
        System.out.println("Capitalized: " + capitalize(text));
    }
}