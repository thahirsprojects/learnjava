package loop;

//print the number which are divisible by 3 and 5 range 1 to 100

public class q5 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i=i+1){

            if(i%3 == 0 && i%5 == 0){

                System.out.println(i);
                
            }
        }
        
    }
    
}
