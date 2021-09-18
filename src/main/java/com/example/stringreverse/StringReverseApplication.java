package com.example.stringreverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringReverseApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringReverseApplication.class, args);

        final String INPUT = "reversed string";
        System.out.println(reverseForLoop(INPUT));
        System.out.println(reverseStringBuilder(INPUT));
    }

    public static String reverseForLoop(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(input.length() - i - 1);
        }
        return "For loop: "+ result;
    }

    private static String reverseStringBuilder(String input) {
        StringBuilder output = new StringBuilder(input).reverse();
        return "String Builder: " + output.toString();
    }

}
