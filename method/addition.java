import java.util.Scanner;

public class addition {
    int a,b,c;

    void sum(){
        System.out.println("The sum is "+ (a+b));

    }

    public static void main(String[] args) {
        addition obj = new addition();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        obj.a = scan.nextInt();
        System.out.print("Enter the value of b : ");
        obj.b = scan.nextInt();

        obj.sum();
    }
}