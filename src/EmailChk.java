import javax.swing.*;
import static jdk.nashorn.internal.objects.NativeString.indexOf;
/**
 * Created by tr70211 on 3/8/2017.
 */
public class EmailChk {
    public static void main(String[] args) {

        String emil = JOptionPane.showInputDialog("Email:");
            //String emil="abbot@prince.pl";

        if (!emil.contains("@")) System.out.println("Not email, missing '@'");
        if (!emil.contains(".")) System.out.println("Not email, missing '.'");

        int a = indexOf(emil, "@");
            //System.out.println(a);
        if (a==0) System.out.println("Invalid position of '@'");

        int b = emil.length()-emil.lastIndexOf(".");
            //System.out.println(b);
        if (b<=3) System.out.println("Invalid domain extension");

        int c = emil.lastIndexOf(".")-(a+1);
            //System.out.println(c);
        if (c<2) System.out.println("Invalid domain name");

    }
}
