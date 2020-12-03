/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DatabaseConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



import java.sql.*;

/**
 *
 * @author pierr
 */
public class InitializationDB {
    Connection conn;
    
    InitializationDB(){
    
    
    DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();
        ResultSet result = db.queryResearch("create table Cars ( ID INT NOT NULL AUTO_INCREMENT,name VARCHAR(50),Ranges INT(100),gearbox boolean,price_per_day double,picture VARCHAR(50),consumption double,seat int,popularity double,type int,Model VARCHAR(50),size double,Agency int,primary key (CarsID)");
        db.queryResearch("INSERT INTO Cars VALUES(1, Renault, 390, true,  12, image.png, 0.17, 4, 4, Electric, RenaultZOE, Small, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(2, Renault, 120, true,  20, image.png, 0 ,1, 3, Electric, TWIZY, Small, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(3, Citroën, 814, false,  12, image.png, 3.8, 4, 5, Normal, CitroënC1, Medium, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(4, Citroën, 723, true,  35, image.png, 6.31, 4, 3, Utilitary, Berlingo, Large, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(5, Opel, 829, true,  23, image.png, 5.8, 4, 2, Normal, Astra, Medium, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(6, Opel, 904, true,  100, image.png, 12, 4, 1, Luxury, SUV, Large, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(7, Volkswagen., 756, true,  29, image.png, 7.6, 4, 3, Normal, Golf, Medium, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(8, Volkswagen., 876, true,  43, image.png, 4.2, 4, 4, Normal, Tiguan, Large, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(9, Mercedes, 978, true,  30, image.png, 8.7, 4, 5, Luxury, Berline, Large, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(10, Mercedes, 956, true,  112, image.png, 9.8, 4, 5, Normal, AMG, Meium, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(11, Ferrari, 657, true,  2500, image.png, 21, 2, 5, Luxury, Spider, Medium, 1);");
        db.queryResearch("INSERT INTO Cars VALUES(12, Lamborghini, 552, true,  4800, image.png, 16.3, 4, 4, Luxury, Aventador, Medium, 1);");
        
        db.queryResearch("Select * from Cars");
        

        
        db.queryResearch("Create table Members( name VARCHAR (15),  login VARCHAR (30),password VARCHAR (30), employee boolean;");
        db.queryResearch("INSERT INTO Members( Elyes, ElyesCarRental, ElyesBenHamida, true");
        db.queryResearch("INSERT INTO Members( Clement, ClementCarRental, axq3fyi9, true");
        db.queryResearch("INSERT INTO Members( Pierre, PierreCarRental, Dougoudou91, true");
        db.queryResearch("INSERT INTO Members( Paul, Bgdu94, 123456, false");
        db.queryResearch("INSERT INTO Members( Jean, Jeanbonbeurre, 987, false");
        db.queryResearch("INSERT INTO Members( Adrien, AdShow , 5623, false");
        db.queryResearch("INSERT INTO Members( Elisa, Elsa, LibéréeDélivrée , false");
        db.queryResearch("INSERT INTO Members( Vanessa, Vanessdu65, Shampoing, false");
        db.queryResearch("INSERT INTO Members( Louise, loulou, MenAreTrash , false");
        db.queryResearch("INSERT INTO Members( Alisée, JPS , Mvoyez, false");
        
        db.queryResearch("Create table Orders(ID INT NOT NULL AUTO_INCREMENT,price double,pickupDate varchar(13),returnDate varchar(13),Idcar INT(2),Idmember INT(2)");
        
        db.queryResearch("INSERT INTO Orders(1, 7500, 30/12/2020, 01/01/2021, 11, 5");
        db.queryResearch("INSERT INTO Orders(2, 389, 27/02/2021, 01/03/2021, 4, 4");
        db.queryResearch("INSERT INTO Orders(3, 650, 14/01/2021, 14/02/2021, 6, 7");
        db.queryResearch("INSERT INTO Orders(4, 960000, 01/01/2020, 21/01/2021, 12, 2");
        db.queryResearch("INSERT INTO Orders(5, 200, 02/12/2020, 04/12/2021, 6, 1");
        db.queryResearch("INSERT INTO Orders(6, 700, 30/12/2020, 18/01/2021, 4,9");
        

        
        
        
        
        
        
        
            //while (result.next()) {
            //  System.out.println(result.getInt(1));
            //}
           // System.out.println("Connexion ");
            
            
            
            
            
            
       
        
    
    
    
    try {
            conn.close();
            System.out.println("Deconnecté");
        } catch (SQLException ex) {

            System.out.println("Pas de connexion");
            System.exit(0);

        }

    }
}
    

