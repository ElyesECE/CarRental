/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.sql.*;

/**
 *
 * @author elyes
 */
public class MembersControlled {

    public void Connect(String login, String password) throws Exception {
        try {
            DatabaseConnector db = new DatabaseConnector();

            db.DatabaseConnect();
            ResultSet result = db.queryResearch("select * from Members where Login = '" + login + "' and Password = '" + password + "';");

            if(result.next()) {
                Members C1 = new Customer(result.getString(2), login, password);
                
                System.out.println(result.getString(2));
            }
            else{
                this.LE();
            }

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("pas de result");
            System.exit(0);

        }
    }
    
    public void LE() throws Exception{
        throw new Exception("False login");
    }

}
