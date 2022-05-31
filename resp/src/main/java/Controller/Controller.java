/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MenuView;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER
 */
public class Controller{
    public static Statement stm;
    public void tampiltabel() throws SQLException{
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Nama Pelamar");
        tb.addColumn("Nilai Portofolio");
        tb.addColumn("Nilai Mikroteaching");
        tb.addColumn("Nilai Wawancara");
        tb.addColumn("Nilai Akhir");
        tblProduct.setModel(tb);
        
        ResultSet res = stm.executeQuery("Select * from aslab");
        while(res.next()){
            tb.addRow(new Object[]{
                res.getString("Nama"),
                res.getString("Nilai Portofolio"),
                res.getString("Nilai Mikroteaching"),
                res.getString("Nilai Wawancara"),
                res.getString("Nilai Akhir"),
            });
        }
        
}
    public void create(){
        
}
    public void update(){
        
}
    public void delete(){
        
}
    
}
