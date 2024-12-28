/*
 * Write a program that categorizes a person based on their age as follows:

If the age is between 0 and 12 (inclusive), print "Child".
If the age is between 13 and 19 (inclusive), print "Teenager".
If the age is between 20 and 64 (inclusive), print "Adult".
If the age is 65 or older, print "Senior".
 */

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if (age >= 0) {
            if (age < 12) {
                System.out.println("CHILDREN");
            } else if (age >= 13 && age <= 19) {
                System.out.println("TEENAGER");
            } else if (age >= 20 && age <= 64) {
                System.err.println("ADULT");
            } else if (age > 65) {
                System.err.println("SENIOR");
            } 
        }
        else {
            System.out.println("ERROR!");
        }
    }

}
