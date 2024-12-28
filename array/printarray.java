package array;

import java.util.Scanner;

public class printarray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];

        for(int i=0;i<10;i++){
            int num=i+1;
            System.out.println("Enter the Number "+num+" to print");
            a[i]= scan.nextInt();
            
        }
        for(int j=0;j<10;j++){
            int num = j+1;
            System.out.println("The number "+num+" is :"+a[j]);
        }


    }
    
}
