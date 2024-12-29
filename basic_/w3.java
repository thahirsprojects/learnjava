
import java.util.Scanner;

/*Get input for 3 integer variables:a,b and c. Now multiply all variable and store it in d.
 Now add all variables and store it in e.Now divide d by e. */

class w3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int d = x * y * z;

        int e = x + y + z;

        System.out.println(d / e);

    }
}