package com.Jack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = in.nextLine();

        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
