
import java.util.Scanner;

//get input for variable name,age,address and print it

class w2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();//when we are going to initialize a string after a int we have to use this
        String address = scan.nextLine();

        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Address : "+ address);

    }
}