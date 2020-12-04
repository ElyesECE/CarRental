/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author elyes
 */
public class Order {

    private int ID;
    private double price;
    private Date pickupDate;
    private Date returnDate;
    private int Idcar;
    private int IdMember;

    public Order(double pri, Date pDate, Date rDate, int idcar, int idmember) {

        pickupDate = pDate;
        returnDate = rDate;
        Idcar = idcar;
        IdMember = idmember;
        price = pri * (rDate.getTime() - pDate.getTime()) / 1000 / 60 / 60 / 24;
        System.out.println("DAYS: " + (rDate.getTime() - pDate.getTime()) / 1000 / 60 / 60 / 24);
    }

    public Order(int id, double pri, Date pDate, Date rDate, int idcar, int idmember) {
        ID = id;
        price = pri;
        pickupDate = pDate;
        returnDate = rDate;
        Idcar = idcar;
        IdMember = idmember;

    }

    public double getPrice() {
        return price;
    }

    public int getID() {
        return ID;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getIdCar() {
        return Idcar;
    }

    public int getIdMember() {
        return IdMember;
    }
    public void addOption(int option){
        price += option;
    }

}
