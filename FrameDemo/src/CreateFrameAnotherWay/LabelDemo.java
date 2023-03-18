package CreateFrameAnotherWay;

import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame {
    private Container c;
    private JLabel label1,label2;
  LabelDemo()
  {
      inItComponents();
  }
  public void inItComponents(){
     c= this.getContentPane();
     c.setBackground(Color.GREEN);
     c.setLayout(null);

     label1= new JLabel();
     label1.setText("Enter your name:- ");
      label1.setBounds(10,10,150,20);
      label1.setForeground(Color.BLUE);
      c.add(label1);

      label2= new JLabel("Enter your password:- ");
      label2.setBounds(10,30,150,20);
      label2.setForeground(Color.red);
      c.add(label2);

  }


    public static void main(String[] args) {
        LabelDemo frame= new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,400);
        frame.setTitle("Lebel Demo");

    }



}
