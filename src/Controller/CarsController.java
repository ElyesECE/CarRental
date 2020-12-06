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

                Cars nouv = new Cars(result.getInt("ID"), result.getString("Model"), result.getString("Brand"), result.getInt("Ranges"), result.getBoolean("Gearbox"), result.getDouble("Price_Per_Day"),
                        result.getString("Picture"), result.getDouble("Consumption"), result.getInt("Seats"),
                        result.getDouble("Popularity"), result.getString("Type"), result.getString("Size"), result.getInt("Agency"));
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
    public ArrayList<Cars> searchCars(String type, String gb, String Brand, String Seats, String Range, String Size, Date begin, Date end) {

        ArrayList<Cars> CarsList = new ArrayList<>();

        String query = "SELECT * FROM Cars ";

        query += "WHERE Type = '" + type + "' AND Ranges " + Range;
        if (gb.endsWith("Manual")) {
            query += " AND Gearbox = false";
        } else {
            query += " AND Gearbox = true";
        }
        if (!Brand.endsWith("All")) {
            query += " AND Brand = '" + Brand + "'";
        }
        if (Seats.endsWith("4 or more")) {
            query += " AND Seats > 4";
        } else {
            query += " AND Seats = " + Seats;
        }

        query += ";";

        System.out.println(type);
        System.out.println(gb);
        System.out.println(Brand);
        System.out.println(Seats);
        System.out.println(Range);
        System.out.println(Size);
        System.out.println(begin);
        System.out.println(end);
        System.out.println(query);

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();
        ResultSet result = db.queryResearch(query);
        int i = 0;
        try {
            while (result.next()) {

                Cars nouv = new Cars(result.getInt("ID"), result.getString("Model"), result.getString("Brand"), result.getInt("Ranges"), result.getBoolean("Gearbox"), result.getDouble("Price_Per_Day"),
                        result.getString("Picture"), result.getDouble("Consumption"), result.getInt("Seats"),
                        result.getDouble("Popularity"), result.getString("Type"), result.getString("Size"), result.getInt("Agency"));
                CarsList.add(nouv);
                System.out.println("\nBrand : " + nouv.getBrand());

            }
        } catch (SQLException ex) {

            System.out.println("error new Cars");
            System.exit(0);

        }

        db.DatabaseDisconnect(db.getConn());

        return CarsList;
    }

}
