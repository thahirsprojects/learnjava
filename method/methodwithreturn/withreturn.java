package methodwithreturn;

import java.util.Scanner;

public class withreturn {

    int sum(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scan.nextInt();

        withreturn obj = new withreturn();

        int sum = obj.sum(num1,num2);

        System.out.println(sum);
    }
    
}
