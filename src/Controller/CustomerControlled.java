/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;

import java.util.ArrayList;

import java.sql.*;

/**
 *
 * @author elyes
 */
public class CustomerControlled {

    private DatabaseConnector db;

    public ArrayList<Order> GetOrder(int idmember) {

        db = new DatabaseConnector();
        ArrayList<Order> OrderList = new ArrayList<>();

        db.DatabaseConnect();

        ResultSet result = db.queryResearch("SELECT * FROM Orders where IdMember = " + idmember + ";");

        try {
            while (result.next()) {
                
                Order nouv = new Order(result.getInt(1), result.getDouble(2), result.getDate(3), result.getDate(4), result.getInt(5), result.getInt(6));
                OrderList.add(nouv);
                System.out.println("Order n : " + OrderList.get(0).getID()+"\nPrice :" + OrderList.get(0).getPrice());
            }
        } catch (SQLException ex) {

            System.out.println("error new ORder");
            System.exit(0);

        }
        db.DatabaseDisconnect(db.getConn());
        return OrderList;

    }

}
