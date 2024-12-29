import java.util.Scanner;

public class garden {

    int apple_count, apple_price;

    void total_money() {
        System.out.println("The total price of apple is " + (apple_count * apple_price));
    }

    public static void main(String[] args) {

        garden obj = new garden();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of apples : ");
        obj.apple_count = scan.nextInt();
        System.out.print("Enter the price of one apple : ");
        obj.apple_price = scan.nextInt();

        obj.total_money();

    }

}
