package Markcalculator;

import java.util.Scanner;

//This is day 3(12/17/2024) of learning java i gonna try to make a mark calculator

public class markcalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0, subjects, outof, totoutof;

        System.out.print("Enter the number of subjects : ");
        subjects = scan.nextInt();
        int[] score = new int[subjects];

        System.out.print("Enter the Highest mark That can be scored (eg:100,50,25) : ");
        outof = scan.nextInt();

        for (int i = 0; i < subjects; i++) {
            int num = i + 1;
            System.out.print("Enter the " + num + " Score : ");
            score[i] = scan.nextInt();
            total = total + score[i];
        }

        totoutof = subjects * outof;

        System.out.println("The Total mark = " + total + "/" + totoutof);
        System.out.println("The Average mark = " + total / subjects + "/" + outof);
    }

}
