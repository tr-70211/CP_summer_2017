/**
 * Created by Pantho on 2017-03-15.
 */
public class BallsPyramid {
    public static void main(String[] args){
        /*balls pyramid, n rows, m increments per row*/

        int m=1;
        int n=5;
        int b=1;
        int p=0;

        for (int i=0;i<n;i++){
            int a=0;
            if (i>0)
                a=m;
            b=b+a;
            p=p+b;
        }
        System.out.println("Number of dots is "+p);






    }
}
