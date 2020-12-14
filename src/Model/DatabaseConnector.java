/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

/**
 *
 * @author elyes
 */
public class DatabaseConnector {

    Connection conn;

    public void DatabaseConnect() {

        String dBURL = "jdbc:mysql://localhost:3306/CarRental?useSSL=false";
        String userName = "root";

        //String passWord = "axq3fyi9";
        // String passWord = "Dougoudou91";
        String passWord = "Elyesbenhamida";
        try {

            conn = DriverManager.getConnection(dBURL, userName, passWord);

            //System.out.println("Connexion ");

        } catch (SQLException ex) {

            System.out.println("Pas de connexion" + ex);
            System.exit(0);

        }

    }

    @SuppressWarnings("empty-statement")
    public void DatabaseDisconnect(Connection conn) {
        try {
            conn.close();
            //System.out.println("Deconnecté");
        } catch (SQLException ex) {

            System.out.println("Pas de connexion");
            System.exit(0);

        };
    }

    public ResultSet queryResearch(String query) {
        ResultSet result = null;
        try {
            Statement stmt = conn.createStatement();

            result = stmt.executeQuery(query);
        } catch (SQLException ex) {

            System.out.println("Query");
            System.exit(0);

        }

        return result;
    }

    public Connection getConn() {
        return conn;
    }

    public int queryAdd(String query) {
        int result = 0;
        try {
            Statement stmt = conn.createStatement();

            result = stmt.executeUpdate(query);
        } catch (SQLException ex) {

            System.out.println("Queryadd");
            System.exit(0);

        }

        return result;

    }

    public PreparedStatement prepareStatement(String result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
