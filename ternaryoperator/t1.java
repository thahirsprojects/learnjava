package ternaryoperator;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number a : ");
        int a = scan.nextInt();
        System.out.print("Enter the second number b : ");
        int b = scan.nextInt();
        // ternary operator

        String result = a > b ? "a is greater" : "a is greater";

        System.out.println(result);
    }

}
