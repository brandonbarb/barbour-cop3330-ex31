/*
 *  UCF COP3330 Summer 2021 Assignment 31 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pulse = input.nextInt();
        int age = input.nextInt();
        double rate;

        System.out.printf("Resting Pulse: %d\t\tAge: %d\n", pulse, age);
        System.out.println("Intensity  \t| Rate");
        System.out.println("------------|--------");
        for (double i = 55; i <= 95; i = i + 5) {
            rate = (((220 - age) - pulse) * (i / 100.000000)) + pulse;
            System.out.printf("%.0f%%\t\t\t| %.0f bpm\n", i, rate);
        }

    }
}
