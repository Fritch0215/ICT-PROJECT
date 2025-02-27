/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.connectmsaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 */
public class ConnectMsAccess {

    public static Connection conn() {

        try {
           Connection con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//PC//Documents//Database3.accdb");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        

    }
}
