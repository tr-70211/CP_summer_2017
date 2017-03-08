/**
 * Created by tr70211 on 3/8/2017.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 5;
        int b = a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        double d1 = 45.5 / 5.2;
        Float f1 = new Double(d1).floatValue();
        //create a new double and then turn it into a float
        System.out.println(f1);

    }

}
