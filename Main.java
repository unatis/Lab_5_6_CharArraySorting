package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char Letters[] = new char[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any 5 letters.");

        for(int i = 0; i < Letters.length; i++){

            Letters[i] = scanner.next().charAt(0);

        }

        Arrays.sort(Letters);

        for(int i = 0; i < Letters.length; i++){

            System.out.println(Letters[i]);

        }

        System.out.println("The End");

    }
}
