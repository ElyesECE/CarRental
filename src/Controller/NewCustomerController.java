/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;
import java.lang.String;
import javax.swing.JOptionPane;

/**
 *
 * @author elyes
 */
public class NewCustomerController {

    public void Connect(String login, String password, String name, boolean type) {

        int result = 0;

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();

        result = db.queryAdd("INSERT INTO Members(Username, Login, Password, Type, Discount, Employes, Salary) VALUES ('" + name + "', '" + login + "', '" + password + "', " + type + ", 0, 0 , 0);");

        db.DatabaseDisconnect(db.getConn());

        System.out.println(result);

    }

    public int ValidInfo(String login, String password, String name, boolean type) {

        DatabaseConnector db = new DatabaseConnector();
        int i = 1;

        db.DatabaseConnect();

        ResultSet result = db.queryResearch("SELECT * FROM Members WHERE Username = '" + name + "' OR Login = '" + login + "';");
        try {
           if(result.next()){
               
                

                } else {
                   
                    this.Connect(login, password, name, type);
                    i = 0;
                
           }
        } catch (SQLException ex) {

            System.out.println("probleme ValidInfo");
            System.exit(0);

        }

        db.DatabaseDisconnect(db.getConn());
        System.out.println("i == " + i);
        return i;

    }

}
