package methodoverloading;

/*With method overloading, multiple methods can have the same name with different parameters */

public class mover {

    static int add(int a, int b) {

        return a + b;

    }

    static int add(int a,int b,int c) {

        return a + b + c;

    }

    public static void main(String[] args) {

        int result = add(345, 565);
        System.err.println(result);

        result = add(344, 345, 3444);
        System.err.println(result);

    }

}
