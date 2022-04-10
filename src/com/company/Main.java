package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the odd number counter!");
        OddNumber OddNo = new OddNumber();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input please random number:");
        int number = scanner.nextInt();
        OddNo.number = number;

        OddNo.OddCalculator();
    }
 }
