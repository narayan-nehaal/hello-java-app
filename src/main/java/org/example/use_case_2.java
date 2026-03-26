package org.example;

public class use_case_2 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide your name as an argument.");
        } else {
            String name = args[0];
            System.out.println("Hello " + name);
        }
    }
}