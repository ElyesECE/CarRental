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

    public void InitDB() {

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();

        int table = db.queryAdd("create table Cars ( ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,name VARCHAR(50),Ranges INT(100),Gearbox boolean,Price_Per_Day double,Picture VARCHAR(50),Consumption double,Seat int,Popularity double, Type int,Model VARCHAR(50),Size double,Agency int");

        db.queryAdd("INSERT INTO Cars VALUES( 'Renault', 390, true,  12, 'car_luxe.png', 0.17, 4, 4, 'Electric', 'RenaultZOE', 'Small', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Renault', 120, true,  20, 'car_luxe.png', 0 ,1, 3, 'Electric', 'TWIZY', 'Small', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Citroën', 814, false,  12, 'car_luxe.png', 3.8, 4, 5, 'Normal', 'CitroënC1', 'Medium', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Citroën', 723, true,  35, 'car_luxe.png', 6.31, 4, 3, 'Utilitary', 'Berlingo', 'Large', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Opel', 829, true,  23, 'car_luxe.png', 5.8, 4, 2, 'Normal', 'Astra', 'Medium', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Opel', 904, true,  100, 'car_luxe.png', 12, 4, 1, 'Luxury', 'SUV', 'Large', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Volkswagen', 756, true,  29, 'car_luxe.png', 7.6, 4, 3, 'Normal', 'Golf', 'Medium', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Volkswagen', 876, true,  43, 'car_luxe.png', 4.2, 4, 4, 'Normal', 'Tiguan', 'Large', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Mercedes', 978, true,  30, 'car_luxe.png', 8.7, 4, 5, 'Luxury', 'Berline', 'Large', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Mercedes', 956, true,  112, 'car_luxe.png', 9.8, 4, 5, 'Normal', 'AMG', 'Medium', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Ferrari', 657, true,  2500, 'car_luxe.png', 21, 2, 5, 'Luxury', 'Spider', 'Medium', 1);");
        db.queryAdd("INSERT INTO Cars VALUES( 'Lamborghini', 552, true,  4800, 'car_luxe.png', 16.3, 4, 4, 'Luxury', 'Aventador', 'Medium', 1);");

        db.queryAdd("Select * from Cars");

        
        db.queryAdd("Create table Members(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT, name VARCHAR (15),  login VARCHAR (30),password VARCHAR (30), employee boolean;");
        db.queryAdd("INSERT INTO Members( 'Elyes', 'ElyesCarRental', 'ElyesBenHamida', true");
        db.queryAdd("INSERT INTO Members( 'Clement', 'ClementCarRental', 'axq3fyi9', true");
        db.queryAdd("INSERT INTO Members( 'Pierre', 'PierreCarRental', 'Dougoudou91', true");
        db.queryAdd("INSERT INTO Members( 'Paul', 'Bgdu94', '123456', false");
        db.queryAdd("INSERT INTO Members( 'Jean', 'Jeanbonbeurre', '987', false");
        db.queryAdd("INSERT INTO Members( 'Adrien', 'AdShow' , '5623', false");
        db.queryAdd("INSERT INTO Members( 'Elisa', 'Elsa', 'LibéréeDélivrée' , false");
        db.queryAdd("INSERT INTO Members( 'Vanessa', 'Vanessdu65', 'Shampoing', false");
        db.queryAdd("INSERT INTO Members( 'Louise', 'loulou', 'MenAreTrash' , false");
        db.queryAdd("INSERT INTO Members( 'Alisée', 'JPS' , 'Mvoyez', false");
        
        db.queryAdd("Create table Orders(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,price double,pickupDate varchar(13),returnDate varchar(13),Idcar INT(2),Idmember INT(2)");
        
        db.queryAdd("INSERT INTO Orders( 7500, '30/12/2020', '01/01/2021', 11, 5");
        db.queryAdd("INSERT INTO Orders( 389, '27/02/2021', '01/03/2021', 4, 4");
        db.queryAdd("INSERT INTO Orders( 650, '14/01/2021', '14/02/2021', 6, 7");
        db.queryAdd("INSERT INTO Orders( 960000, '01/01/2020', '21/01/2021', 12, 2");
        db.queryAdd("INSERT INTO Orders( 200, '02/12/2020', '04/12/2021', 6, 1");
        db.queryAdd("INSERT INTO Orders( 700, '30/12/2020', '18/01/2021', 4,9");
        
        db.queryAdd("Create table Agency(ID NOT NULL AUTO_INCREMENT, Adress vachar(30), name varchar(10))");

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
