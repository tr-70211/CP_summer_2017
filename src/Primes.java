/**
 * Created by Pantho on 2017-03-21.
 */
public class Primes {
    public static void main(String[] args) {

// input number of primes desired into ppreq
        int prreq=30;
        int prcount=0;
        for (int no=2; prcount<=prreq-1; no++)
        {
            int fcount = 0;
            for (int i = 1; i <= no; i++)
            {
                if ((no % i) == 0)
                {
                    ++fcount;
                }
            }
            if (fcount == 2)
            {
                System.out.println(no + " is a prime");
                ++prcount;
            }
        }

    }
}