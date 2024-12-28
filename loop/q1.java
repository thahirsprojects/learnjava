package loop;

import java.util.Scanner;

//Get input for 2 variable and print the number from a to b

public class q1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number");
        int j = scan.nextInt();
        System.out.print("Enter the second number(the number should be greater than the first one)");
        int k =scan.nextInt();


        for(int i=j;i<=k;i=i+1){
            System.out.println(i);

        }
    }
    
}
