/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.CarsController;
import Controller.MembersControlled;
import Controller.OrderController;
import View.EmployeeHomePage;
import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class Employee extends Members {

    protected double salary;
    private ArrayList<Order> OrderList = new ArrayList<>();
    private ArrayList<Customer> MembersListList = new ArrayList<>();
    private ArrayList<Cars> CarsList = new ArrayList<>();

    public Employee(String n, String l, String p, int id, double sal) {

        super(n, l, p, id);

        salary = sal;

        OrderController test = new OrderController();
        OrderList = test.getAllOrder();

        MembersControlled b = new MembersControlled();
        MembersListList = b.getMembers();

        CarsController c = new CarsController();
        CarsList = c.getCars();

        EmployeeHomePage chp = new EmployeeHomePage(OrderList, MembersListList, CarsList);
        chp.setVisible(true);

    }

}
