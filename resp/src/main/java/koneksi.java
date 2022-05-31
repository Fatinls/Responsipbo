
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import aslab_db.sql;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class koneksi {
    String DBurl = "jdbc:mysql://localhost/aslab_db";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;
    public koneksi() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Terkoneksi");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
