import java.util.Scanner;
/**
 * Created by Pantho on 2017-04-05.
 */
public class InputParams {

    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Input: ");
                while (scan.hasNext()) {
                    //String input = scan.next();
                             Integer input = scan.nextInt();
                    System.out.println("Got: " + input);
                }


    }
}
