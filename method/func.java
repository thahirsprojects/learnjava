public class func{

    /*In Java, a function is called a method.
     It's a block of code that performs a specific task, takes input (parameters), 
     and optionally returns a value. */

    void greeting(){
        System.out.println("Good Morning");
        intro();
    }

    void intro(){
        System.out.println("How are you?");

    }

    static void end(){
        System.out.println("See you Later");
    }

    public static void main(String[] args) {
        func obj1 = new func();
        obj1.greeting();
        end();
        
    }
}