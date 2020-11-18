/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;
import javax.swing.*;

import java.sql.*;

/**
 *
 * @author elyes
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COUCOU
       
        
        String dBURL = "jdbc:mysql://localhost:3306/database1?useSSL=false";
        String userName = "root";
        String passWord = "axq3fyi9";
        

        try {
            
            Connection conn = DriverManager.getConnection(dBURL, userName, passWord);
            //Statement stmt = conn.createStatement();
            //String query = "select * from test;";
            //ResultSet result = stmt.executeQuery(query);
            //while (result.next()) {
              //  System.out.println(result.getInt(1));
            //}
            //String query2 = "INSERT INTO test(id) VALUES (4);";
            //int result2 = stmt.executeUpdate(query2);

            
            
            System.out.println("Connexion ");

            
            

            

        } catch (SQLException ex) {

            System.out.println("Pas de connexion");
            ex.printStackTrace();
            System.exit(0);

        };
        
    }

}
