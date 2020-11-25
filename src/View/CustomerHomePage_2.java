/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cars;
import Model.Customer;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author elyes
 */
public class CustomerHomePage_2 extends JFrame {

    private Customer user;
    private ArrayList<Cars> ListCars;
    private javax.swing.JLabel jLabel2;

    public CustomerHomePage_2(Customer user, ArrayList<Cars> listcars) {

        this.user = user;
        ListCars = listcars;
        //init2Components();
        initComponents1();
    }

    public void initComponents1() {

        setTitle("CustomerHomePage_2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jLabel2 = new JLabel();
        setSize(300, 500);
        jLabel2.setIcon(ListCars.get(0).getImage());
        add(jLabel2, BorderLayout.CENTER);

    }
}
