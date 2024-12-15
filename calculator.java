import java.util.Scanner;

//This a simple calculator using switch case

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the operator(+,-,*,/): ");
        char operator = scan.next().charAt(0);
        System.out.print("Enter the first number : ");
        int firstnum = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the second number : ");
        int secondnum = scan.nextInt();

        switch (operator) {
            case '+':
                System.out.println(firstnum+secondnum);
                break;

            case '-':
                System.out.println(firstnum-secondnum);
                break;
            
            case '*':
                System.out.println(firstnum*secondnum);
                break;
            
            case '/':
                System.out.println(firstnum/secondnum);

        
            default: 
                System.out.println("ERROR! ENTER A VALID OPERATOR");
                break;
        }
        


    }
    
}
