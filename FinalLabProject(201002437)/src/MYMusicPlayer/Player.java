package MYMusicPlayer;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Player extends JPanel implements ActionListener{

    JFrame window = new JFrame("Music Player Of Nahim");

      ImageIcon myIcon;
    JButton addbtn = new JButton("Add");
    JButton plybtn = new JButton("Play");
    JButton stopbtn = new JButton("Stop");
    Font cstmfont = new Font("", Font.BOLD, 25);
    JComboBox musiclist = new JComboBox();


    JFileChooser browser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("WAV Sounds", "wav");



    int returnValue;
    int idx = 0;
    String[] music = new String[5];
    File selectFile;

    File sound;
    AudioInputStream audio;
    Clip clp;



    Player() {

        window.setBounds(150, 150, 400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        this.setBackground(Color.LIGHT_GRAY);
        window.add(this);
        myIcon= new ImageIcon(getClass().getResource("projectpic.jpg"));
        window.setIconImage(myIcon.getImage());

        addbtn.addActionListener(this);
        plybtn.addActionListener(this);
        stopbtn.addActionListener(this);

        addbtn.setBackground(Color.darkGray);
        plybtn.setBackground(Color.darkGray);
        stopbtn.setBackground(Color.darkGray);


        addbtn.setForeground(Color.green);
        plybtn.setForeground(Color.green);
        stopbtn.setForeground(Color.green);

        window.add(addbtn, BorderLayout.LINE_START);
        window.add(plybtn, BorderLayout.CENTER);
        window.add(stopbtn, BorderLayout.LINE_END);

        addbtn.setFont(cstmfont);
        plybtn.setFont(cstmfont);
        stopbtn.setFont(cstmfont);

        window.add(musiclist, BorderLayout.PAGE_END);
        musiclist.setBackground(Color.blue);
        musiclist.setForeground(Color.DARK_GRAY);






    }



    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(addbtn)) {

            returnValue = browser.showOpenDialog(window);


            if (returnValue == browser.APPROVE_OPTION) {

                selectFile =browser.getSelectedFile();

                music[idx] = selectFile.toString();
                musiclist.addItem("Song-" + idx);
                idx++;

            }
        }


        else if (ae.getSource() == plybtn) {

            try {
                if (musiclist.getSelectedIndex() == 0) {
                    sound = new File(music[musiclist.getSelectedIndex()]);
                    audio = AudioSystem.getAudioInputStream(sound);
                    clp = AudioSystem.getClip();
                    clp.open(audio);
                    clp.start();
                } else if (musiclist.getSelectedIndex() == 1) {
                    sound = new File(music[musiclist.getSelectedIndex()]);
                    audio = AudioSystem.getAudioInputStream(sound);
                    clp = AudioSystem.getClip();
                    clp.open(audio);
                    clp.start();
                } else if (musiclist.getSelectedIndex() == 2) {
                    sound = new File(music[musiclist.getSelectedIndex()]);
                    audio = AudioSystem.getAudioInputStream(sound);
                    clp = AudioSystem.getClip();
                    clp.open(audio);
                    clp.start();
                } else if (musiclist.getSelectedIndex() == 3) {
                    sound = new File(music[musiclist.getSelectedIndex()]);
                    audio = AudioSystem.getAudioInputStream(sound);
                    clp = AudioSystem.getClip();
                    clp.open(audio);
                    clp.start();
                } else if (musiclist.getSelectedIndex() == 4) {
                    sound = new File(music[musiclist.getSelectedIndex()]);
                    audio = AudioSystem.getAudioInputStream(sound);
                    clp = AudioSystem.getClip();
                    clp.open(audio);
                    clp.start();
                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }


        else if (ae.getSource().equals(stopbtn)) {
            clp.stop();

        }


    }



    public static void main(String[] args) {

        Player mp3 = new Player();

    }


}