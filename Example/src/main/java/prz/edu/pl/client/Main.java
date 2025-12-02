package prz.edu.pl.client;

import prz.edu.pl.zastosowania.example.MyUtils;

public class Main {
    public static void main(String[] args) {

        String text = "hello world from my library!";

        String result = MyUtils.capitalize(text);

        System.out.println("Original:   " + text);
        System.out.println("Capitalized: " + result);
    }
}
