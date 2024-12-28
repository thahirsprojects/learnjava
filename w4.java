
import java.util.Scanner;

/*get the input for 3 variables name,score and department.
Let the user enter the score for 100 marks and conver it for 10 and print it*/

class w4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your score: ");
        double score = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your department: ");
        String department = scan.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your score is " + score/10+"/10");
        System.out.println("Your department is "+ department);



    }
}