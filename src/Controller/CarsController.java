/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import javax.swing.JOptionPane;

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
    
      public ArrayList<Cars> getCars() {
        ArrayList<Cars> CarsList = new ArrayList<>();

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();
        ResultSet result = db.queryResearch("SELECT * FROM Cars ORDER ;");
        
        try {
            while (result.next()) {

                Cars nouv = new Cars(result.getInt("ID"), result.getString("Model"), result.getString("Brand"), result.getInt("Ranges"), result.getBoolean("Gearbox"), result.getDouble("Price_Per_Day"),
                        result.getString("Picture"), result.getDouble("Consumption"), result.getInt("Seats"),
                        result.getDouble("Popularity"), result.getString("Type"), result.getString("Size"), result.getInt("Agency"));
                CarsList.add(nouv);
                System.out.println("\\carrental\\image\\" + result.getString("Picture") + "\nBrand : " + result.getString("Brand"));

                
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
    public ArrayList<Cars> searchCars(String type, String gb, String Brand, String Seats, String Range, String Size, Date begin, Date end, String sortBy) {

        ArrayList<Cars> CarsList = new ArrayList<>();

        String query = "SELECT * FROM Cars ";

        query += "WHERE Type = '" + type + "' AND Ranges = " + Range + " AND Size = '" + Size + "'";
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

        query += " ORDER BY " + sortBy + ";";
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

    public void searchCars2(ArrayList<String> choice, Date begin, Date end, String sortBy, Customer user, CustomerHomePage chp) {

        ArrayList<Cars> CarsList = new ArrayList<>();
        boolean and = false;
        boolean where = false;

        String query = "SELECT * FROM Cars ";
        for (int i = 0; i < 6 ; i++) {
            System.out.println("\ntaille : "+choice.size()+"\nchoice.get("+i+") :" +choice.get(i));
            if (!choice.get(i).endsWith("All") && !where) {
                query += "WHERE";
                where = true;
            }
        }
        if (!choice.get(0).endsWith("All")) {
            query += " Type = '" + choice.get(0);
            and = true;
        }
        if (!choice.get(4).endsWith("All")) {
            if (and) {
                query += " AND";
            }
            query += " Ranges " + choice.get(4);
            and = true;
        }
        if (!choice.get(5).endsWith("All")) {
            if (and) {
                query += " AND";
            }
            query += " Size = '" + choice.get(5) + "'";
            and = true;
        }
        if (!choice.get(1).endsWith("All")) {
            if (and) {
                query += " AND";
            }
            if (choice.get(1).endsWith("Manual")) {
                query += " Gearbox = false";
                and = true;
            } else {
                query += " Gearbox = true";
                and = true;
            }
        }
        if (!choice.get(2).endsWith("All")) {
            if (and) {
                query += " AND";
            }
            query += " Brand = '" + choice.get(2) + "'";
            and = true;
        }
        if (!choice.get(3).endsWith("All")) {
            if (and) {
                query += " AND";
            }
            if (choice.get(3).endsWith("4 or more")) {
                query += " Seats > 4";
                and = true;
            } else {
                query += " Seats = " + choice.get(3);
                and = true;
            }
        }

        query += " ORDER BY " + sortBy + ";";

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

            }
        } catch (SQLException ex) {

            System.out.println("error new Cars");
            System.exit(0);

        }

        db.DatabaseDisconnect(db.getConn());

        if (!CarsList.isEmpty()) {

            ResearchPage pages = new ResearchPage(CarsList, begin, end, user, chp, choice);
            chp.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(chp, " No Cars Founds ");
        }

    }

    /* public void searchCars2(ArrayList<String> choice, Date begin, Date end, String sortBy, Customer user, ListCars lc) {

        ArrayList<Cars> CarsList = new ArrayList<>();

        String query = "SELECT * FROM Cars ";

        query += "WHERE Type = '" + choice.get(0) + "' AND Ranges " + choice.get(4) + " AND Size = '" + choice.get(5) + "'";
        if (choice.get(1).endsWith("Manual")) {
            query += " AND Gearbox = false";
        } else {
            query += " AND Gearbox = true";
        }
        if (!choice.get(2).endsWith("All")) {
            query += " AND Brand = '" + choice.get(2) + "'";
        }
        if (choice.get(3).endsWith("4 or more")) {
            query += " AND Seats > 4";
        } else {
            query += " AND Seats = " + choice.get(3);
        }

        query += " ORDER BY " + sortBy + ";";

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

        if (!CarsList.isEmpty()) {

            ResearchPage pages = new ResearchPage(CarsList, begin, end, user, lc);
            lc.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(lc, " No Cars Founds ");
        }

    }*/
}
