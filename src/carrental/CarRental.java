/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

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
        String dBURL = "jdbc:mysql://localhost:3306/dbTest";
        String userName = "root";
        String passWord = "Elyesbenhamida";
        String fr="bonjour";
        String de="bonjour la street";

        try {
            
            Connection conn = DriverManager.getConnection(dBURL, userName, passWord);
            Statement stmt = conn.createStatement();
            String query = "select * from test;";
            ResultSet result = stmt.executeQuery(query);
            
            String query2 = "INSERT INTO test(id) VALUES (2);";
            //int result2 = stmt.executeUpdate(query2);

            
            
            System.out.println("Connexion ");
            while(result.next()){
                System.out.println(result.getInt(1));
            }
            
            

            

        } catch (SQLException ex) {

            System.out.println("Pas de connexion");
            ex.printStackTrace();
            System.exit(0);

        };

    }

}
