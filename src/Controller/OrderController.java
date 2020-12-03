/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static javax.swing.UIManager.getInt;


/**
 *
 * @author elyes
 */
public class OrderController {
    
    private ArrayList<Order>a =new ArrayList<Order>();
    
   
    
    
    public ArrayList<Order> getOrder(int idmember)
    {
              try {
            DatabaseConnector db = new DatabaseConnector();

            db.DatabaseConnect();
            ResultSet result = db.queryResearch("select * from Orders where IdMember = '" + idmember +"'ORDER BY ID DESC;");

            if(result.next()) {
                  
               a.add(new Order(result.getInt("ID"), result.getDouble("Price"),result.getDate("Pickupdtae"),result.getDate("ReturnDate"),result.getInt("IdCar"),idmember));
            }
            

            db.DatabaseDisconnect(db.getConn());

        } catch (SQLException ex) {

            System.out.println("pas de result");
            System.exit(0);

        }
              return a;
    
    }
    
    
    
}
