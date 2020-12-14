/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.sql.*;
import java.util.ArrayList;

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

            if (result.next()) {

                System.out.println("employe   " + result.getBoolean("Employee"));

                if (result.getBoolean("Employee") == false) {
                    Members C1 = new Customer(result.getString(2), login, password, result.getInt(1), result.getBoolean("Customer_Type"), result.getDouble("Discount"));

                    System.out.println(result.getString(2));
                } else if (result.getBoolean("Employee")) {
                    Members C2 = new Employee(result.getString(2), login, password, result.getInt(1), result.getDouble("Salary"));

                }
            } else {
                this.LE();
            }

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("Member controller");
            System.exit(0);

        }
    }

    public void LE() throws Exception {
        throw new Exception("False login");
    }

    public int UpdateInfoUser(String newPassword, String newLogin, int ID) {
        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();

        int Update = db.queryAdd("update Members set Password ='" + newPassword + "', Login ='" + newLogin + "' where ID =" + ID + "");

        db.DatabaseDisconnect(db.getConn());
        return Update;

    }

    public ArrayList<Members> getMembers() {
        ArrayList<Members> a = new ArrayList<>();
        try {
            DatabaseConnector db = new DatabaseConnector();

            db.DatabaseConnect();
            ResultSet result = db.queryResearch("select * from Members;");

            while (result.next()) {

                a.add(new Members(result.getString(2), result.getString(3), result.getString(4), result.getInt(1)));
            }

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("pas de result");
            System.exit(0);

        }
        return a;

    }

    public void setUpdateMembers(String query) {

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();

        int Update = db.queryAdd(query);

        db.DatabaseDisconnect(db.getConn());

    }

}
