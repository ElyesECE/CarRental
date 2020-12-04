/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.*;

/**
 *
 * @author elyes
 */
public class Cars {

    //private String ID;
    private String model;
    private String brand;
    private int range;
    private boolean gearbox;
    private double price_per_day;
    private int max_location_time;
    private ImageIcon picture;
    private double consumption;
    private int seat;
    private double popularity;
    private String type;
    private String Idcar;
    private String size;
    private int Agency;

    public Cars(String Model, String Brand, int range, boolean gearbox, double price_per_day, int max_location_time, String image, double consumption, int seat, double popularity, String type, String Idcar, String size, int Agency) {
        this.model = Model;
        this.brand = Brand;
        this.range = range;
        this.gearbox = gearbox;
        this.price_per_day = price_per_day;
        this.max_location_time = max_location_time;
        picture = new ImageIcon("\\carrental\\image\\" + image);
        this.consumption = consumption;
        this.seat = seat;
        this.popularity = popularity;
        this.type = type;
        this.Idcar = Idcar;
        this.size = size;
        this.Agency = Agency;

    }

    public Cars(String Model, String Name, String image, double pop) {
        this.model = Model;
        this.brand = Name;
        picture = new ImageIcon(System.getProperty("user.dir") + "\\src\\carrental\\image\\" + image);
        this.popularity = pop;
    }//C:\Users\elyes\Documents\GitHub\CarRental\src\carrental\image\car_luxe.png

    public String getBrand() {
        return brand;
    }

    public ImageIcon getImage() {
        return picture;
    }

    public int getRange() {
        return range;

    }

    public boolean getGearBox() {
        return gearbox;

    }

    public double getPricePerDay() {
        return price_per_day;

    }

    public int getMaxLocationTime() {
        return max_location_time;
    }

    public double getComsumption() {
        return consumption;
    }

    public int getSeat() {
        return seat;

    }

    public double getPopularity() {
        return popularity;
    }

    public String getType() {
        return type;

    }

    public String getIdcar() {
        return Idcar;

    }

    public String getSize() {
        return size;

    }

    public int getAgency() {
        return Agency;

    }

    public String getModel() {
        return model;

    }

}
