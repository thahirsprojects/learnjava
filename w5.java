
import java.util.Scanner;

//get two numbers and compare them
class w5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("NUMBER COMPARISION");
        System.out.print("Enter First Number : ");
        int firstnum = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Second Number : ");
        int secondnum = scan.nextInt();

        if(firstnum>secondnum){
            System.out.println(firstnum+" IS GREATER THAN "+secondnum);

        }
        else if(firstnum==secondnum){
            System.out.println(firstnum+" IS EQUAL TO "+secondnum);
        }
        else{
            System.out.println(secondnum+" IS GREATER THAN "+firstnum);
        }



    }
}
