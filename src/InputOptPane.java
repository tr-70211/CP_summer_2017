import javax.swing.*;

/**
 * Created by Pantho on 2017-04-05.
 */
public class InputOptPane {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(
                "please provide input: ");

        JOptionPane.showMessageDialog(null,
                "Hello I got: "+ input);


    }

}
