package com.example.stringreverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringReverseApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringReverseApplication.class, args);
        reverse("string");
    }

    public static void reverse(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(input.length() - i - 1);
        }
        System.out.println(result);
    }

}
