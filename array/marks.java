package array;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int[] score = new int[5];
        int total = 0;

        Scanner scan = new Scanner(System.in);

        for(int i=0 ;i<5 ;i++){
            System.out.print("Enter the Score : ");
            score[i]=scan.nextInt();
            total = total + score[i];
        }

        //to print the output
        for(int j=0 ;j<5 ;j++){
            System.out.println("The Score "+score[j]);
        }

        System.out.println("The total score is "+total);
        System.out.println("The average score is "+total/5);

    }
    
}
