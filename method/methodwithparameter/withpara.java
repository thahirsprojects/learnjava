package methodwithparameter;
public class withpara {
        void getsoap(int money){
            System.out.println(money);
            System.out.println("Soap Purchashed");
        }

        void getchocolate(int money){
            System.out.println(money);
            System.out.println("Chocolate Purchashed");
        }
        public static void main(String[] args) {
             
            withpara obj = new withpara();
            obj.getsoap(46);
            obj.getchocolate(20);


    }
}
