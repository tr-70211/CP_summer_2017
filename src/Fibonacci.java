/**
 * Created by Pantho on 2017-03-21.
 */
public class Fibonacci {
    public static void main(String[] args){

        int one=1; int two=1;
        System.out.println(one);System.out.println(two);
        int n=6;
// where n is the number of terms of the Fibonacci sequence we want to print

        for (int i=0;i<n-2;i++){
            int next=one+two;
            one=two;
            two=next;
            System.out.println(next);
        }



    }
}
