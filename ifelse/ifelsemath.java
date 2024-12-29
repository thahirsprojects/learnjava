
//get input and check whether it is divisible by 3 and 5

import java.util.Scanner;

public class ifelsemath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number you have entered is divisible by 3 and 5");
        } else {
            System.out.println("The number you have entered is not divisible by 3 and 5");
        }

    }

}
