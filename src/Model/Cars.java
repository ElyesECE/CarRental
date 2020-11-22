/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.awt.image.BufferedImage;
/**
 *
 * @author elyes
 */
public class Cars {
    
    //private String ID;
    private String Model;
    private String name;            
    private int range;
    private int dimension;
    private boolean gearbox;
    private double price_per_day;
    private int max_location_time;
    private BufferedImage picture;
    private double consumption;
    private int seat;
    private double popularity;
    private int type;
    private String Idcar;
    private double size;
    private int Agency;
    
    public Cars(String Model,String name,int range,int dimension,boolean gearbox,double price_per_day,int max_location_time,BufferedImage picture,double consumption,int seat,double popularity,int type,String Idcar,double size,int Agency)
    {
            this.Model=Model;
    this.name=name;
     this. range=range;
    this.dimension=dimension;
     this.gearbox=gearbox;
     this.price_per_day=price_per_day;
     this.max_location_time=max_location_time;
     this.picture=picture;
     this.consumption=consumption;
     this.seat=seat;
     this.popularity=popularity; 
     this.type=type;
     this.Idcar=Idcar;
    this.size=size;
     this.Agency=Agency;
        
    
    
    }
    
   
    
    
    
    
    
}
