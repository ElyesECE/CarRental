/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.*;

import View.*;

import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class Customer extends Members {

    private boolean type;
    private double discount;
    private ArrayList<Order> OrderList = new ArrayList<>();

    public Customer(String n, String l, String p) {
        super(n, l, p);
        System.out.println("ca marche !!!!!");

        CustomerControlled a = new CustomerControlled();
        OrderList = a.GetOrder(1);
        CarsController b = new CarsController();

        ArrayList<Cars> aa = new ArrayList<>();
        aa = b.getHomePageTopRating();

        CustomerHomePage chp = new CustomerHomePage(this, aa);
        chp.setVisible(true);

    }

    public boolean getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }

    public ArrayList<Order> getList() {
        return OrderList;
    }

}
