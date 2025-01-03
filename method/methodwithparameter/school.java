package methodwithparameter;
import java.util.Scanner;

public class school {

    String passorfail(int mark){

        if(mark>=35){
            return "PASS!";
        }
        else{
            return "FAIL";
        }



    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        school obj = new school();

        System.out.print("ENTER THE MARK : ");
        int mark = scan.nextInt();

        String result = obj.passorfail(mark);
        System.out.println(result);

        
    }
    
}
