/**
 * Created by Pantho on 2017-03-22.
 */
public class Arrays {

    public static void main(String[] args){
        Integer [] arInt = new Integer [3];
        // int [] arInt = new int [3];
        // once you've created the array it has an immutable size
        arInt[0] = 5;
        arInt[1] = 7;

        for (int i=0; i<arInt.length;i++) {
            System.out.println(arInt[i]);
        }

        String [] arStr = new String[] {
                "abc", "def", "ghi"
        };

        for (int j=0;j<arStr.length;j++){
            System.out.println(arStr[j]);
        }

        for (String el: arStr) {
            System.out.println("foreach " +el);
        }

    }
}
