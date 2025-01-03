package methodwithparameter;
public class cal {

    void sum(int a,int b){
            System.out.println(a+"+"+b+"="+(a+b));
        }

    void sub(int a, int b) {
        System.out.println(a+"-"+b+"="+(a-b));
    }

    void mul(int a,int b){
        System.out.println(a+"*"+b+"="+(a*b));
    } 

    void div(int a,int b){
        System.out.println(a+"/"+b+"="+(a/b));
    }

    public static void main(String[] args) {

        cal obj = new cal();

        obj.sum(23, 34);

        obj.sub(45, 54);

        obj.mul(23, 23);

        obj.div(100, 10);

    }
}
