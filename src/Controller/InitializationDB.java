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

    public void InitDB() {

        DatabaseConnector db = new DatabaseConnector();

        db.DatabaseConnect();
        
        
        int table = db.queryAdd("create table Cars ( ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT ,Brand VARCHAR(50),Ranges INT(100),Gearbox boolean,Price_Per_Day double,Picture VARCHAR(50),Consumption double,Seats int,Popularity double, Type VARCHAR(30),Model VARCHAR(50),Size VARCHAR(20), Agency int);");

        table = db.queryAdd("INSERT INTO Cars VALUES(1, 'Renault', 390, true,  12, 'renault-zoe.png', 0.17, 4, 4, 'Electric', 'RenaultZOE', 'Small', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(2, 'Renault', 120, true,  20, 'twizy.png', 0 ,1, 3, 'Electric', 'TWIZY', 'Small', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(3, 'Citroën', 814, false,  12, 'citroënC1.png', 3.8, 4, 5, 'Normal', 'CitroënC1', 'Medium', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(4, 'Citroën', 723, true,  35, 'berlingo.png', 6.31, 4, 3, 'Utilitary', 'Berlingo', 'Large', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(5, 'Opel', 829, true,  23, 'OpelAstra.png', 5.8, 4, 2, 'Normal', 'Astra', 'Medium', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(6, 'Opel', 904, true,  100, 'OpelSUV.png', 12, 4, 1, 'Luxury', 'SUV', 'Large', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(7, 'Volkswagen', 756, true,  29, 'VolswGolf.png', 7.6, 4, 3, 'Normal', 'Golf', 'Medium', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(8, 'Volkswagen', 876, true,  43, 'Tiguan.png', 4.2, 4, 4, 'Normal', 'Tiguan', 'Large', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(9, 'Mercedes', 978, true,  30, 'Mercedes-Benz.png', 8.7, 4, 5, 'Normal', 'Berline', 'Large', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(10, 'Mercedes', 956, true,  112, 'AMG.png', 9.8, 4, 5, 'Luxury', 'AMG', 'Medium', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(11, 'Ferrari', 657, true,  2500, 'Ferrari.png', 21, 2, 5, 'Luxury', 'Spider', 'Medium', 1);");
        table = db.queryAdd("INSERT INTO Cars VALUES(12, 'Lamborghini', 552, true,  4800, 'Aventador.png', 16.3, 4, 4, 'Luxury', 'Aventador', 'Medium', 1);");

        table = db.queryAdd("Create table Members(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT, Username VARCHAR (20),  Login VARCHAR (40),Password VARCHAR (30), Employee boolean);");
        table = db.queryAdd("INSERT INTO Members VALUES(1, 'Elyes', 'ElyesCarRental', 'ElyesBenHamida', true);");
        table = db.queryAdd("INSERT INTO Members VALUES(2, 'Clement', 'ClementCarRental', 'axq3fyi9', true);");
        table = db.queryAdd("INSERT INTO Members VALUES(3, 'Pierre', 'PierreCarRental', 'Dougoudou91', true);");
        table = db.queryAdd("INSERT INTO Members VALUES(4, 'Paul', 'Bgdu94', '123456', false);");
        table = db.queryAdd("INSERT INTO Members VALUES(5, 'Jean', 'Jeanbonbeurre', '987', false);");
        table = db.queryAdd("INSERT INTO Members VALUES(6, 'Adrien', 'AdShow' , '5623', false);");
        table = db.queryAdd("INSERT INTO Members VALUES(7, 'Elisa', 'Elsa', 'LibéréeDélivrée' , false);");
        table = db.queryAdd("INSERT INTO Members VALUES(8, 'Vanessa', 'Vanessdu65', 'Shampoing', false);");
        table = db.queryAdd("INSERT INTO Members VALUES(9, 'Louise', 'loulou', 'MenAreTrash' , false);");
        table = db.queryAdd("INSERT INTO Members VALUES(10, 'Alisée', 'JPS' , 'Mvoyez', false);");

        table = db.queryAdd("Create table Orders(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT , Price double, PickupDate DATE,ReturnDate DATE, Idcar INT(2), Idmember INT(2), OptionPack INT(1));");

        table = db.queryAdd("INSERT INTO Orders VALUES(1, 7500, '2020-05-03', '2020-05-10', 11, 5, 3);");
        table = db.queryAdd("INSERT INTO Orders VALUES(2, 389, '2020-02-27', '2020-03-01', 4, 4, 2);");
        table = db.queryAdd("INSERT INTO Orders VALUES(3, 650, '2020-01-14', '2020-02-14', 6, 1, 1);");
        table = db.queryAdd("INSERT INTO Orders VALUES(4, 960000, '2020-01-01', '2020-01-21', 12, 1, 2);");
        table = db.queryAdd("INSERT INTO Orders VALUES(5, 200, '2020-12-02', '2020-12-04', 6, 1, 1);");
        table = db.queryAdd("INSERT INTO Orders VALUES(6, 700, '2020-12-30', '2021-01-18', 4,9, 1);");

        table = db.queryAdd("Create table Agency(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT, Adress varchar(50), name varchar(10));");
        table = db.queryAdd("INSERT INTO Agency VALUES(1, '10 Street Albert Park', 'YesCar');");
        //while (result.next()) {
        //  System.out.println(result.getInt(1));
        //}
        // System.out.println("Connexion ");

        db.DatabaseDisconnect(db.getConn());

    }
}
