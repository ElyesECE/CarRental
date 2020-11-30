/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.*;
import javax.swing.*;

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

        Login a = new Login();
        //ListCars a = new ListCars();
        //CustomerHomePage a = new CustomerHomePage();
        a.setVisible(true);

        System.out.print(System.getProperty("user.dir"));

    }

}
