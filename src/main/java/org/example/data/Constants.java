package org.example.data;

import java.util.ArrayList;
import java.util.List;


public class Constants {

    public static final String platinum = "Platinum";
    public static final String silver = "Silver";
    public static final String gold = "Gold";

    public static final float service_tax = 14;
    public static final float swachh_bharat_cess = 0.5F;
    public static final float krishi_kalyan_cess = 0.5F;

    public static float calculateServiceTax(int subTotal) {
        return subTotal * service_tax / 100;
    }

    public static float calculateSwachhBharatCess(int subTotal) {
        return subTotal * swachh_bharat_cess / 100;
    }

    public static float calculateKrishiKalyanCess(int subTotal) {
        return subTotal * krishi_kalyan_cess / 100;
    }

    public static float calculateTotal(int subTotal, float service_tax, float swachh_bharat_cess, float krishi_kalyan_cess) {
        return subTotal + service_tax + swachh_bharat_cess + krishi_kalyan_cess;
    }

    public static void setShowsData(List<Shows> showsList) {

        List<Seats> seatsList1 = new ArrayList<>();
        seatsList1.add(new Seats("A1", true, platinum, 320));
        seatsList1.add(new Seats("A2", true, platinum, 320));
        seatsList1.add(new Seats("A3", true, platinum, 320));
        seatsList1.add(new Seats("A4", true, platinum, 320));
        seatsList1.add(new Seats("A5", true, platinum, 320));
        seatsList1.add(new Seats("A6", true, platinum, 320));
        seatsList1.add(new Seats("A7", true, platinum, 320));
        seatsList1.add(new Seats("A8", true, platinum, 320));
        seatsList1.add(new Seats("A9", true, platinum, 320));
        seatsList1.add(new Seats("B1", true, gold, 280));
        seatsList1.add(new Seats("B2", true, gold, 280));
        seatsList1.add(new Seats("B3", true, gold, 280));
        seatsList1.add(new Seats("B4", true, gold, 280));
        seatsList1.add(new Seats("B5", true, gold, 280));
        seatsList1.add(new Seats("B7", true, gold, 280));
        seatsList1.add(new Seats("B8", true, gold, 280));
        seatsList1.add(new Seats("B9", true, gold, 280));
        seatsList1.add(new Seats("B6", true, gold, 280));
        seatsList1.add(new Seats("C1", true, silver, 240));
        seatsList1.add(new Seats("C2", true, silver, 240));
        seatsList1.add(new Seats("C3", true, silver, 240));
        seatsList1.add(new Seats("C4", true, silver, 240));
        seatsList1.add(new Seats("C5", true, silver, 240));
        seatsList1.add(new Seats("C6", true, silver, 240));
        seatsList1.add(new Seats("C7", true, silver, 240));
        seatsList1.add(new Seats("C8", true, silver, 240));
        seatsList1.add(new Seats("C9", true, silver, 240));
        showsList.add(new Shows(1, seatsList1));

        List<Seats> seatsList2 = new ArrayList<>();
        seatsList2.add(new Seats("A1", true, platinum, 320));
        seatsList2.add(new Seats("A2", true, platinum, 320));
        seatsList2.add(new Seats("A3", true, platinum, 320));
        seatsList2.add(new Seats("A4", true, platinum, 320));
        seatsList2.add(new Seats("A5", true, platinum, 320));
        seatsList2.add(new Seats("A6", true, platinum, 320));
        seatsList2.add(new Seats("A7", true, platinum, 320));
        seatsList2.add(new Seats("A8", true, platinum, 320));
        seatsList2.add(new Seats("A9", true, platinum, 320));
        seatsList2.add(new Seats("B1", true, gold, 280));
        seatsList2.add(new Seats("B2", true, gold, 280));
        seatsList2.add(new Seats("B3", true, gold, 280));
        seatsList2.add(new Seats("B4", true, gold, 280));
        seatsList2.add(new Seats("B5", true, gold, 280));
        seatsList2.add(new Seats("B6", true, gold, 280));
        seatsList2.add(new Seats("B7", true, gold, 280));
        seatsList2.add(new Seats("B8", true, gold, 280));
        seatsList2.add(new Seats("B9", true, gold, 280));
        seatsList2.add(new Seats("C1", true, silver, 240));
        seatsList2.add(new Seats("C2", true, silver, 240));
        seatsList2.add(new Seats("C3", true, silver, 240));
        seatsList2.add(new Seats("C4", true, silver, 240));
        seatsList2.add(new Seats("C5", true, silver, 240));
        seatsList2.add(new Seats("C6", true, silver, 240));
        seatsList2.add(new Seats("C7", true, silver, 240));
        seatsList2.add(new Seats("C8", true, silver, 240));
        seatsList2.add(new Seats("C9", true, silver, 240));

        showsList.add(new Shows(2, seatsList2));

        List<Seats> seatsList3 = new ArrayList<>();
        seatsList3.add(new Seats("A1", true, platinum, 320));
        seatsList3.add(new Seats("A2", true, platinum, 320));
        seatsList3.add(new Seats("A3", true, platinum, 320));
        seatsList3.add(new Seats("A4", true, platinum, 320));
        seatsList3.add(new Seats("A5", true, platinum, 320));
        seatsList3.add(new Seats("A6", true, platinum, 320));
        seatsList3.add(new Seats("A7", true, platinum, 320));
        seatsList3.add(new Seats("A8", true, platinum, 320));
        seatsList3.add(new Seats("A9", true, platinum, 320));
        seatsList3.add(new Seats("B1", true, gold, 280));
        seatsList3.add(new Seats("B2", true, gold, 280));
        seatsList3.add(new Seats("B3", true, gold, 280));
        seatsList3.add(new Seats("B4", true, gold, 280));
        seatsList3.add(new Seats("B5", true, gold, 280));
        seatsList3.add(new Seats("B6", true, gold, 280));
        seatsList3.add(new Seats("B7", true, gold, 280));
        seatsList3.add(new Seats("B8", true, gold, 280));
        seatsList3.add(new Seats("B9", true, gold, 280));
        seatsList3.add(new Seats("C1", true, silver, 240));
        seatsList3.add(new Seats("C2", true, silver, 240));
        seatsList3.add(new Seats("C3", true, silver, 240));
        seatsList3.add(new Seats("C4", true, silver, 240));
        seatsList3.add(new Seats("C5", true, silver, 240));
        seatsList3.add(new Seats("C6", true, silver, 240));
        seatsList3.add(new Seats("C7", true, silver, 240));
        seatsList3.add(new Seats("C8", true, silver, 240));
        seatsList3.add(new Seats("C9", true, silver, 240));

        showsList.add(new Shows(3, seatsList3));
    }
}
