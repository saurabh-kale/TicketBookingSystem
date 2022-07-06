package org.example.data;

import java.util.HashMap;
import java.util.List;

public class Util {

    public boolean checkIfShowExists(List<Shows> showsList, String show_no) {
        boolean show_exist = false;
        int show_id;
        try {
            show_id = Integer.parseInt(show_no);
            for (Shows shows : showsList) {
                if (shows.getShow_id() == show_id) {
                    show_exist = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return show_exist;
    }

    public void calculateTotalRevenue(List<Bookings> bookingsList) {
        System.out.println("Total Sales: ");
        float totalRevenue = 0;
        float serviceTax = 0;
        float swachh_bharat_cess = 0;
        float krishi_kalyan_cess = 0;

        for (Bookings bookings : bookingsList) {
            totalRevenue += bookings.getSubTotal();
            serviceTax += bookings.getServiceTax();
            swachh_bharat_cess += bookings.getSwachhBharatCess();
            krishi_kalyan_cess += bookings.getKrishiKalyanCess();
        }
        System.out.println("Revenue: Rs. " + totalRevenue);
        System.out.println("Service Tax: Rs. " + serviceTax);
        System.out.println("Swachh Bharat Cess: Rs. " + swachh_bharat_cess);
        System.out.println("Krishi Kalyan Cess: Rs. " + krishi_kalyan_cess);
    }

    public Boolean checkIfAllSeatsAreAvailable(List<Shows> showsList, String show_no, HashMap<String, Boolean> seats_selected) {
        // check if all the seats are available.
        boolean seats_available_flag = true;

        for (Shows shows : showsList) {
            // get details of show id from the showsList entered by user.
            if (shows.getShow_id() == Integer.parseInt(show_no)) {
                for (Seats seats : shows.getSeats()) {
                    for (String s : seats_selected.keySet()) {
                        if (s.equals(seats.getSeat_no())) {
                            if (!seats.getSeat_availability()) {
                                // set seats available flag to false;
                                seats_available_flag = false;
                                // set seat value to false entered by user.
                                seats_selected.put(s, false);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return seats_available_flag;
    }

    public int getSubTotal(HashMap<String, Boolean> seats_selected, List<Shows> showsList, String show_no) {
        int subTotal = 0;
        for (Shows shows : showsList) {
            // get details of show id from the showsList entered by user.
            if (shows.getShow_id() == Integer.parseInt(show_no)) {
                for (Seats seats : shows.getSeats()) {
                    for (String s : seats_selected.keySet()) {
                        if (s.equals(seats.getSeat_no())) {
                            if (seats.getSeat_availability()) {
                                subTotal += seats.getSeat_price();
                            }
                        }
                    }
                }
            }
        }
        return subTotal;
    }
}
