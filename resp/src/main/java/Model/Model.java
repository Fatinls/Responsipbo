/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.table.DefaultTableModel;
import helper.Data;

/**
 *
 * @author USER
 */
public class Model extends DefaultTableModel{
    public Model(){
        super(Data.DATA, Data.TABEL_HEADER);
    }
}
