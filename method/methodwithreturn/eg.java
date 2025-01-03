package methodwithreturn;

public class eg {

    String getname(){
        return "Thahir";
    }

    public static void main(String[] args) {
        
        eg obj = new eg();

        String name = obj.getname();

        System.out.println(name);
    }
    
}
