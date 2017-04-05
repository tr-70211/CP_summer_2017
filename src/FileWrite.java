import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Pantho on 2017-03-29.
 */
public class FileWrite {


    public static void main(String[] args){
        File newFile = new File("E:/newfile.txt");
        try{
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw =new BufferedWriter (fw);
            bw.write("abcdef");
            bw.newLine();
            bw.write("2nd line");
            bw.newLine();
            bw.append("3rd line");
            bw.close();

        } catch (IOException e){
            e.printStackTrace();
        }






    }

}
