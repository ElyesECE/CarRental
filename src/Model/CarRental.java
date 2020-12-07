/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.*;

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
     //InitializationDB nouv = new InitializationDB();
<<<<<<< HEAD
    // nouv.InitDB();
=======
     //nouv.InitDB();
>>>>>>> 9a7cb2dbd96a910c5eddbc812f173ead5b9b52a3
      
       
       
       
        Login a = new Login();
        //ListCars a = new ListCars();
        //CustomerHomePage a = new CustomerHomePage();
        a.setVisible(true);

        System.out.print(System.getProperty("user.dir"));

    }

}
