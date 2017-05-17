import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Pantho on 2017-03-22.
 */
public class TextFileRead {

    public static void main(String[] args){
        /*
        Scanner scanner = new Scanner(System.in);
        String input=scanner.next();
        System.out.println(input);
        */


        File myFile = new File("E:\\docu.txt");
        try (Scanner scanner = new Scanner(myFile)) {
            int i = 0;
            while (scanner.hasNext()) {
                String currLine = scanner.nextLine();
                System.out.println(i + ": " + currLine);
                i++;
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }

    }
}
