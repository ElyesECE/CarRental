/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author elyes
 */
public class OrderController {

    public ArrayList<Order> getOrder(int idmember) {
        ArrayList<Order> a = new ArrayList<>();
        try {
            DatabaseConnector db = new DatabaseConnector();

            db.DatabaseConnect();
            ResultSet result = db.queryResearch("select * from Orders where IdMember = '" + idmember + "' ORDER BY ID DESC;");

            while (result.next()) {

                a.add(new Order(result.getInt(1), result.getDouble(2), result.getDate(3), result.getDate(4), result.getInt(5), result.getInt(6)));
            }

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("pas de result");
            System.exit(0);

        }
        System.out.println(" ajout  order n :" + a.size());
        return a;

    }

    public ArrayList<Order> getAllOrder() {

        ArrayList<Order> a = new ArrayList<>();
        try {
            DatabaseConnector db = new DatabaseConnector();

            db.DatabaseConnect();
            ResultSet result = db.queryResearch("select * from Orders;");

            if (result.next()) {

                a.add(new Order(result.getInt(1), result.getDouble(2), result.getDate(3), result.getDate(4), result.getInt(5), result.getInt(6)));
            }

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("pas de result");
            System.exit(0);

        }
        return a;

    }

}
