/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.*;

import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class Customer extends Members {

    protected boolean type;
    protected double discount;
    //protected ArrayList<Order> Members=new ArrayList<>();

    public Customer(String n, String l, String p) {
        super(n, l, p);
        System.out.println("ca marche !!!!!");
        
        CustomerHomePage chp = new CustomerHomePage();
        chp.setVisible(true);
                

    }

}
