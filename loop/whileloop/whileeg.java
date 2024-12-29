package loop.whileloop;
import java.util.Random;

public class whileeg {

    public static void main(String[] args) {
        
        Random rand = new Random();
        int random_number = 0;
        
        while(random_number!=5){

            random_number = rand.nextInt(11);

            System.out.println(random_number);

        }


    }

    
}
