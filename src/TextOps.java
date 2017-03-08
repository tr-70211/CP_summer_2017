/**
 * Created by tr70211 on 3/8/2017.
 */
public class TextOps {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s2 + s1;
        System.out.println(s3);

        int posBC = s3.indexOf("bc");

        System.out.println(posBC);

        int posAB = s3.lastIndexOf("bc");

    }
}
