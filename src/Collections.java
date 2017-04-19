import java.util.*;

/**
 * Created by Pantho on 2017-04-19.
 */
public class Collections {
    public static void main(String[] args) {
        //Collection

        Collection<Integer> coll = new ArrayList<Integer>();
        //coll.add();
        List<Integer> list1 = new ArrayList<>();

        list1.add(2544);
        list1.add(65465);
        list1.add(25454);
        list1.add(2544);

        //list1.remove(3);
        list1.remove(new Integer(2544));

        for (Integer el : list1) {
            System.out.println(el);
        }

        Set<String> myset = new HashSet<>();
        // you cannot have two pointers to the same object where an array may
        myset.add("abc");
        myset.add("Peter");
        myset.add("Anne");
        myset.add("abc");

        for (String st : myset) {
            System.out.println(st);
        }

        List<String> mystrlist = new ArrayList<>();
        mystrlist.add("mystring");
        mystrlist.addAll(myset);

        System.out.println(       );

        for (String s: mystrlist){
            System.out.println(s);
        }

        if (mystrlist.contains("Peter")){
            System.out.println("mystrlist contains peter");
        }

        //hashset is the most basic set but a tree set is another set where the elements are automatically sorted

        Set<String> mySortedSet = new TreeSet<>();
        mySortedSet.addAll(mystrlist);
        System.out.println();

        for ( String s : mySortedSet) {
            System.out.println(s); //first caps are output, then non-caps
        }

    }
}
