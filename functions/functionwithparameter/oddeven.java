import java.util.Scanner;

public class oddeven{


    void oddoreven(int num){
        if(num%2==0){
            System.out.println("EVEN NUMBER!");
        }
        else{
            System.out.println("ODD NUMBER!");

        }

    }

    public static void main(String[] args) {

        oddeven obj = new oddeven();

        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER A NUMBER : ");

        int number = scan.nextInt();
        
        obj.oddoreven(number);
        
    }
}