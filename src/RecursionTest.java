/**
 * Created by Pantho on 2017-03-22.
 */
public class RecursionTest {

        static int fact(int n) {
            int result;
            if ( n ==1) return 1;
            result = fact (n-1) * n;
            return result;
        }

    public static void main (String args[]) {
        //RecursionTest f = new RecursionTest();
        System.out.println("Factorial of 4 is " + fact(4));
    }
}
