/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

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
        String dBURL = "jdbc:mysql:";
        String userName = "root";
        String passWord = "";

        try {
            
            Connection conn = DriverManager.getConnection(dBURL, userName, passWord);
            //Statement stmt = conn.createStatement();
            //String query = "select IDKey from tTest where nom = 'elyes';";
            //ResultSet result = stmt.executeQuery(query);

            System.out.println("Connexion ");

        } catch (SQLException ex) {

            System.out.println("Pas de connexion");
            ex.printStackTrace();
            System.exit(0);

        };

    }

}
