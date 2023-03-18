package MYMusicPlayer;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MusicAdd {

        public static void add() {
            try{
                Class.forName("com.mysql.jdbc.driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/musicstore","root","null");

                PreparedStatement ps=con.prepareStatement(
                        "insert into musiclist values(?,?)");

                File f=new File("F:\\Java codes\\FinalLabProject\\src\\MYMusicPlayer");
                FileReader fr=new FileReader(f);

                ps.setInt(1,101);
                ps.setCharacterStream(2,fr,(int)f.length());
                int i=ps.executeUpdate();
                System.out.println(i+" records affected");

                con.close();

            }catch (Exception e) {e.printStackTrace();}
        }
    }



