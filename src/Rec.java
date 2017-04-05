/**
 * Created by Pantho on 2017-03-22.
 */
public class Rec
{

    public static int countBowls(int row){
        if (row==1) return 1;
        else return countBowls(row-1)+2;
    }

    public static void main(String[] args){

        int sum = countBowls(6);
        System.out.println(sum);
}

}
