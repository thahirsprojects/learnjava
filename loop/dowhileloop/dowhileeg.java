package loop.dowhileloop;

import java.util.Scanner;

/* Get the input for a var the input shouls be greater than ten
 * if not ask the user to enter again
 */

public class dowhileeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        do{
            System.out.print("Enter a number greater than 10 : ");
            count = scan.nextInt();
        }
        while(count<10);
    }

    
}
