
import java.util.Scanner;

//get input for variable:name and age and print it

class w1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
}