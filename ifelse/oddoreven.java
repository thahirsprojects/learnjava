//get an input for a variable and check odd or even

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        if (num%2 ==0) {
            System.out.println("It is an even number!");            
        }
        else if(num%2 != 0){
            System.out.println("It is an odd number");
        }
        else{
            System.out.println("ERROR! Enter a valid number");
        }

    }
    
}
