package classes_objects;

public class marks {

    int tamil, english, maths, social, science;

    int total;

    float avg;

    public static void main(String[] args) {

        marks student1 = new marks();

        student1.english = 46;
        student1.tamil = 75;
        student1.maths = 48;
        student1.social = 98;
        student1.science = 76;

        student1.total = student1.tamil+student1.english+student1.maths+student1.social+student1.science;

        student1.avg = student1.total/5 ;

        System.out.println("The total mark is "+student1.total);
        System.out.println("The average mark is "+student1.avg);

        marks student2 = new marks();

        student2.english = 75;
        student2.tamil = 94;
        student2.maths = 78;
        student2.social = 88;
        student2.science = 86;

        student2.total = student2.tamil+student2.english+student2.maths+student2.social+student2.science;

        student2.avg = student2.total/5 ;

        System.out.println("The total mark is "+student2.total);
        System.out.println("The average mark is "+student2.avg);
    }
}
