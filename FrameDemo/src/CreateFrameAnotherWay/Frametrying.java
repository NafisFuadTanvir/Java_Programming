package CreateFrameAnotherWay;

import javax.swing.*;
import java.awt.*;

public class Frametrying extends JFrame {

    private ImageIcon icon;
    private Container c;
    //with constructor

    /*Frametrying() {
        setDefaultCloseOperation(Frametrying.EXIT_ON_CLOSE);
          setBounds(100,100,500,500);
           setTitle("My new Frame");
    }*/
    Frametrying()
    {
         initComponents();
    }
    public void initComponents(){

        c= this.getContentPane();
        c.setBackground(Color.lightGray);

        icon= new ImageIcon(getClass().getResource("ironman.png"));
        this.setIconImage(icon.getImage());


    }

    public static void main(String[] args) {
        Frametrying frame= new Frametrying();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Frametrying.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setTitle("My new Frame");
    }
}
