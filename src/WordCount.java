import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Pantho on 2017-05-07.
 */
public class WordCount {

    public static void main(String[] args) {
//establishing the map ahead of time
        Map<String, Integer> wordcount = new HashMap<>();
//reading the file from whichever location
        File article = new File("E:\\test.txt");
        try (Scanner thefile = new Scanner(article)) {
            int i = 0;
            while (thefile.hasNext()) {
//reading paragraphs, then splitting them into words
                String paragraph = thefile.nextLine();
                String[] word = paragraph.split(" ");
                    for (String pal : word) {
//to normalise a word
                        pal = pal.toLowerCase();
                        pal = pal.replace(".","");
                        pal = pal.replace(",","");
                        pal = pal.replace("?","");
                        pal = pal.replace("!","");
                        pal = pal.replace(";","");
                        pal = pal.replace(":","");
                        pal = pal.replace("\"","");
//to appropriately /put/ in the map
                        if ( wordcount.containsKey(pal) ) {
                            wordcount.put(pal, wordcount.get(pal)+1);
                        } else {
                            wordcount.put(pal, 1);
                        }
                    }
                i++;
            }
        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
//output
        for (String s : wordcount.keySet()) {
            System.out.println("Count of: "+ s+"        \t\t\t\t\t\t\t"+wordcount.get(s));
        }

    }
//QUESTION: how would I make certain parts/checks into sub?functions (in the same class) which I could call upon
}
