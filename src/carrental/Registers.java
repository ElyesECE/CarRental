/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;
import java.util.ArrayList;

/**
 *
 * @author elyes
 */
public class Registers {
    
    private ArrayList<Order> orderList;
    
    Registers(){
        
        orderList = new ArrayList<>();
    }
    
    public void addOrder(Order newOrder){
        orderList.add(newOrder);
    }
        
    
    
    
}
