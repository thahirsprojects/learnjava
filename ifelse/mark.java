//get input for variable mark and if mark >35 pass else print fail

import java.util.Scanner;

public class mark{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = scan.nextInt();
        if (mark>=35) {
            System.out.println("Pass!");
            
        }
        else{
            System.out.println("Fail!");
        }
    }
}