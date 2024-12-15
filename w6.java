
import java.util.Scanner;

class w6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you like (type yes or no)");
        String option = scan.nextLine();
        if (option.equals("yes")) {
            System.out.println("you like apple");
            
        } 
        else if(option.equals("no")) {
            System.out.println("opps! you don't like apple");
        }
        else{
            System.out.println("ERROR! Enter a valid option");
        }

    }
}