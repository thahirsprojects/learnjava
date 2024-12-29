/*Loop inside a loop is nested loop */

package loop.nestedloop;

import java.util.Scanner;

/*printing 
 *  *
 *  **
 *  ***
 *  ****
*/

public class nested {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}