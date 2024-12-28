
class variable {

    public static void main(String args[]) {

        //type variablename = value ;
        //integer variable
        int a = 34;
        System.out.println(a);

        //string variable
        String b = "Thahir";
        System.out.println(b);

        //float variable
        float c = 22.33f;
        System.out.println(c);

        //char variable
        char d = 'd';
        System.out.println(d);

        //boolean variable
        boolean e = true;
        System.out.println(e);

        //printing another variable
        String f = b;
        System.out.println(f);

        //changing the value of the variable
        a = 200;
        System.out.println(a);//now the value of a is 200

        //final or constant - if we use final or constant then it becomes unchangeable
        final int g = 300;
        System.out.println(g);

        //adding a text with a variable here + will combain the text
        String name = "thahir";
        System.out.println("Hello " + name);

        //adding two variables here + will work as a mathematical operator
        int x = 45;
        int y = 35;
        System.out.println(x + y);

        //declaring many variables
        int w = 3, v = 4, n = 2;
        System.out.println(w + y + n);

        //declaring one value to multiple variables
        int r, t, h;
        r = t = h = 57;
        System.out.println(r + t + h);

        /*All Java variables must be identified with unique names.

        These unique names are called identifiers.

        Identifiers can be short names (like x and y) or
        more descriptive names (age, sum, totalVolume).

        Note: It is recommended to use descriptive names in order to 
        create understandable and maintainable code*/
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;
    }
}


/* The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs

Names must begin with a letter

Names should start with a lowercase letter, and cannot contain whitespace

Names can also begin with $ and _

Names are case-sensitive ("myVar" and "myvar" are different variables)

Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/

/*And there are some other variables like byte,short,long,double */