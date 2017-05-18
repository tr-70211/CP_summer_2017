package bank.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pantho on 2017-05-17.
 */
public class MyFirstWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My first window");
        frame.setSize(500,400);
            //maximum, minimum, preferred size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* dispose same effect as exit
        do nothing - program can only be killed
        hide - frame is closed byt program keeps working
        exit on close exits all windows
        if you don't set anything the default is dispose on close */

        LayoutManager layoutManager = new FlowLayout();
        //  grid layout, border layout
        frame.setLayout(layoutManager);

        JPanel panel1 = new JPanel();
        JLabel lbl1 = new JLabel("First Name");
        panel1.add(lbl1);
        JTextField firstNameField = new JTextField(20);
        panel1.add(firstNameField);

        JPanel lastNamePanel = new JPanel();
        JLabel lbl2 = new JLabel("Last Name");
        lastNamePanel.add(lbl2);
        JTextField lastNameField = new JTextField(20);
        lastNamePanel.add(lastNameField);

        //lastNameField.setEnabled(false);
        // set editable (allows for selection)
        // set text

        JButton myButton = new JButton("Login");
        panel1.add(myButton);
        //buttons generate events
        // listeners listen to events and react

        // Anonymous inner class
        myButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.getContentPane().add(panel1);
        frame.getContentPane().add(lastNamePanel);
        frame.setVisible(true);
        //setvisiblle false for switching between windows, should be at the end

        JFrame frame2 = new JFrame();
        frame2.setTitle("My second window");
        frame2.setSize(500,400);
        frame2.setLocation(300,300);
        frame.setVisible(true);


    }

    //swing not only option. can also swt

}
