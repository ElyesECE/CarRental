/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.OrderController;
import View.CustomerHomePage;
import View.EmployeeHomePage;
import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class Employee extends Members {

    protected double salary;
     private ArrayList<Order> OrderList = new ArrayList<>();
     private ArrayList<Cars> aa = new ArrayList<>();
     

    public Employee(String n, String l, String p, int id) {
        
        super(n ,l ,p, id);
        
        OrderController test = new OrderController();
        OrderList=test.getAllOrder();
        
        
        EmployeeHomePage chp = new EmployeeHomePage(OrderList);
         chp.setVisible(true);
        
        
        
        
        
        
        
        
    }

}
