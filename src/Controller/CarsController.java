/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.*;
import java.sql.*;
import java.util.*;

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

                Cars nouv = new Cars(result.getString("Model"), result.getString("Brand"), result.getString("Photo_path"), result.getDouble("Popularity"));
                CarsList.add(nouv);
                System.out.println(result.getString("Photo_path") + "Brand : " + result.getString("Brand"));
                System.out.println("Order n : " + CarsList.get(0).getBrand());
                i++;
            }
        } catch (SQLException ex) {

            System.out.println("error new Cars");
            System.exit(0);

        }

        db.DatabaseDisconnect(db.getConn());

        return CarsList;

    }

}
