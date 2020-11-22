/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.DatabaseConnector;
import Model.Members;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cleme
 */
public class CarsController {
    public void Listcars(String login, String password) {
        try {
            DatabaseConnector db = new DatabaseConnector();

            db.DatabaseConnect();
            ResultSet result = db.queryResearch("select * from Members where Login = '" + login + "' and Password = '" + password + "';");

            while (result.next()) {
                Members C1 = new Customer(result.getString(2), login, password);
                System.out.println(result.getString(2));
            }

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("pas de result");
            System.exit(0);

        }
    }
    
}
