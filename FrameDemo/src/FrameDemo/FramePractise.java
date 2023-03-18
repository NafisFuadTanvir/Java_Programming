package FrameDemo;

import javax.swing.*;

public class FramePractise {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200,50);
        //set size and set location combined use in setBound method:-
        frame.setBounds(200,200,500,500);
        frame.setTitle("My First Gui");
    }
}
