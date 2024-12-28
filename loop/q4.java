package loop;

//count the number of even numbers from 1 to 10

public class q4 {
    public static void main(String[] args) {

        int a = 0;
        for(int i=1;i<=10;i=i+1){
 
            if(i%2 == 0){
                a = a + 1;
            }
        }
        
        System.out.println(a);
    }
}
