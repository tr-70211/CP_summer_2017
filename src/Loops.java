/**
 * Created by Pantho on 2017-03-15.
 */
public class Loops {
    public static void main(String[] args){

        for (int i=0;i<10;i++) {
            if (i==6) continue;
            /*continue to the next iteration*/

            System.out.println("i is=" +i);
            if (i>7) break;
        }

        /*check criticisms of break and goto*/

        /*
        for (int j=5;j<10;j--) {
            System.out.println("j is=" + j);
            break
        }
        */

        /*mannually dedclare iterator. it doesn't work inside loop*/

        int k=0;
        while (k<10) {
            System.out.println("k=" + k);
            k++;
        }

        int l = 10;
        do {
            System.out.println("l="+l);
            l--;
        }   while (l<5);


    }
}
