package loop;

import java.util.Scanner;

public class printtable {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Enter the number to print table : ");
        num = scan.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
    
}
