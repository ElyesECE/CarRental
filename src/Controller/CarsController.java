/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

/**
 *
 * @author cleme
 */
public class CarsController {

    public ArrayList<Cars> getHomePageTopRating() {
        ArrayList<Cars> CarsList = new ArrayList<>();

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();
        ResultSet result = db.queryResearch("SELECT * FROM Cars ORDER BY Popularity DESC;");
        int i = 0;
        try {
            while (result.next() && i < 3) {

                Cars nouv = new Cars(result.getString("Model"), result.getString("Brand"), result.getString("Picture"), result.getDouble("Popularity"));
                CarsList.add(nouv);
                System.out.println("\\carrental\\image\\" + result.getString("Picture") + "\nBrand : " + result.getString("Brand"));

                i++;
            }
        } catch (SQLException ex) {

            System.out.println("error new Cars");
            System.exit(0);

        }

        db.DatabaseDisconnect(db.getConn());

        return CarsList;

    }

    /*Cars nouv = new Cars(result.getString("Model"),result.getString("Brand"),result.getInt("range"),result.getBoolean("Gearbox"),
             result.getDouble("Price"),result.getInt("Max_duration"), result.getString("Photo_path"),
             result.getDouble("Consomation"),result.getInt("Seats"),result.getDouble("Popularity"),result.getInt("Type"),
             result.getString("ID_car"),result.getDouble("size"), result.getInt("Agency"));*/
    public ArrayList<Cars> searchCars(String type, String gb, Date begin, Date end) {

        ArrayList<Cars> CarsList = new ArrayList<>();

        String query = "SELECT * FROM Cars WHERE Brand = 'Renault';";

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();
        ResultSet result = db.queryResearch(query);
        int i = 0;
        try {
            while (result.next()) {

                Cars nouv = new Cars(result.getString("Model"), result.getString("Brand"), result.getInt("Ranges"), result.getBoolean("Gearbox"), result.getDouble("Price_Per_Day"),
                        result.getString("Picture"), result.getDouble("Consumption"), result.getInt("Seats"),
                        result.getDouble("Popularity"), result.getString("Type"), result.getString("Size"), result.getInt("Agency"));
                CarsList.add(nouv);
                System.out.println("\nBrand : " + CarsList.get(0).getBrand());

                
            }
        } catch (SQLException ex) {

            System.out.println("error new Cars");
            System.exit(0);

        }

        db.DatabaseDisconnect(db.getConn());
        
        

        return CarsList;
    }

}
