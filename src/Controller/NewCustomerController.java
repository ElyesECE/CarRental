/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;
import java.lang.String;

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

}
