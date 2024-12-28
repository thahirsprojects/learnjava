import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = scan.nextInt();
        if (income<=50000) {
            System.out.println("Your are eligible for Scholarship");    
        }
        else{
            System.out.println("You are not eligible for scholarship");
        }

    }
    
}
