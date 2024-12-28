
import java.util.Scanner;

class ifelse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scan.nextInt();
        if (a<100) {
            System.out.println("The number "+ a + " less than 100");
        } else {
            System.out.println("The number " + a + " greater than 100");
        }

    }
}