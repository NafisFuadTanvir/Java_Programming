package MYMusicPlayer;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class MyConnection {
    Connection conn;
    public static Connection connnect(){
        try{
            String driver  = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String username = "root";
            String password = null;
            Class.forName(driver);

            Connection conn = DriverManager.getConnection( url,username,password);
            return conn;


        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

