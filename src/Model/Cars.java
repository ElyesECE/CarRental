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

    private int ID;
    private String model;
    private String brand;
    private int range;
    private boolean gearbox;
    private double price_per_day;
    private ImageIcon picture;
    private double consumption;
    private int seat;
    private double popularity;
    private String type;
    private String size;
    private int Agency;

    public Cars(int id, String Model, String Brand, int range, boolean gearbox, double price_per_day, String image, double consumption, int seat, double popularity, String type, String size, int Agency) {
        ID = id;
        this.model = Model;
        this.brand = Brand;
        this.range = range;
        this.gearbox = gearbox;
        this.price_per_day = price_per_day;
        picture = new ImageIcon(System.getProperty("user.dir") + "\\src\\carrental\\image\\" + image);
        this.consumption = consumption;
        this.seat = seat;
        this.popularity = popularity;
        this.type = type;
        this.size = size;
        this.Agency = Agency;

    }

    public Cars(String Model, String Name, String image, double pop) {
        this.model = Model;
        this.brand = Name;
        picture = new ImageIcon(System.getProperty("user.dir") + "\\src\\carrental\\image\\" + image);
        this.popularity = pop;
    }

    public String getBrand() {
        return brand;
    }

    public ImageIcon getImage() {
        return picture;
    }

    public int getRange() {
        return range;

    }

    public int getID() {
        return ID;

    }

    public boolean getGearBox() {
        return gearbox;

    }

    public double getPricePerDay() {
        return price_per_day;

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
