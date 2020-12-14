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
    private ArrayList<Order> OrderHomepage = new ArrayList<>();

    public Customer(String n, String l, String p, int id, boolean typ, double disc) {
        super(n, l, p, id);
        System.out.println("ca marche !!!!!");
        type = typ;
        discount = disc;

        CustomerControlled a = new CustomerControlled();

        OrderList = a.GetOrder(id);
        CarsController b = new CarsController();

        OrderController test = new OrderController();
        OrderHomepage = test.getOrder(idmember);

        ArrayList<Cars> aa = new ArrayList<>();
        aa = b.getHomePageTopRating();

        CustomerHomePage chp = new CustomerHomePage(this, aa, OrderHomepage);
        chp.setVisible(true);

    }

    public Customer(String n, String l, String p, int id, boolean typ, double disc, int a) {
        super(n, l, p, id);
        type = typ;
        discount = disc;

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

    public int getID() {
        return idmember;
    }

    public String getLogin() {
        return login;
    }

}
