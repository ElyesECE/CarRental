/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.ListCars;
import java.util.ArrayList;

/**
 *
 * @author elyes
 */
public class ResearchPage {

    private ArrayList<Cars> listCars;
    private ArrayList<ListCars> listView;

    public ResearchPage(ArrayList<Cars> lc) {
        listCars = lc;
        listView = new ArrayList<>();

        int a = 0;
        int size = listCars.size() / 3;
        System.out.println(size);
        if (listCars.size() % 3 != 0) {
            size += 1;
        }
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            ArrayList<Cars> tampon = new ArrayList<>();
            tampon.add(listCars.get(a));
            if (listCars.size() >= a + 1) {
                tampon.add(listCars.get(a + 1));

            }
            if (listCars.size() >= a + 2) {
                tampon.add(listCars.get(a + 2));
            }
            a += 3;

            listView.add(new ListCars(tampon, i, this));

        }

        listView.get(0).setVisible(true);

    }

    public void nextPage(int page) {

        if (page + 1 < listView.size()) {
            listView.get(page).setVisible(false);
            System.out.println("nextpage");
            listView.get(page + 1).setVisible(true);
        }
    }

    public void previousPage(int page) {

        if (page - 1 >= 0) {
            listView.get(page).setVisible(false);
            System.out.println("previouspage");
            listView.get(page - 1).setVisible(true);
        }
    }

}
