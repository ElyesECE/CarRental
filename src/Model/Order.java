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
    
    private int numberDays;
    private double price;
    private Date pickupDate;
    private Date returnDate;
    private int Idcar;
    private int IdMemebr;
    
    Order(int nbDay, double pri, Date pDate, Date rDate /*, Cars car*/){
        nbDay = numberDays;
        pri = price;
        pDate = pickupDate;
        rDate = returnDate;
        //car = cars;
      
    }
    
    public int getNumDays(){
        return numberDays;
    }
    public double getPrice(){
        return price;
    }
    public Date getPickupDate(){
        return pickupDate;
    }
    public Date getReturnDate(){
        return returnDate;
    }
    /*public Cars getCars(){
        return cars;
    }*/
    
    
}
