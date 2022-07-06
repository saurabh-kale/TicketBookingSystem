package org.example.data;

import java.util.Set;

public class Bookings {
    int show_no;
    Set<String> seats;
    float subTotal;
    float serviceTax;
    float swachhBharatCess;
    float krishiKalyanCess;

    public Bookings(int show_no, Set<String> seats, float subTotal, float serviceTax, float swachhBharatCess, float krishiKalyanCess) {
        this.show_no = show_no;
        this.seats = seats;
        this.subTotal = subTotal;
        this.serviceTax = serviceTax;
        this.swachhBharatCess = swachhBharatCess;
        this.krishiKalyanCess = krishiKalyanCess;
    }

    public int getShow_no() {
        return show_no;
    }

    public void setShow_no(int show_no) {
        this.show_no = show_no;
    }

    public Set<String> getSeats() {
        return seats;
    }

    public void setSeats(Set<String> seats) {
        this.seats = seats;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(float serviceTax) {
        this.serviceTax = serviceTax;
    }

    public float getSwachhBharatCess() {
        return swachhBharatCess;
    }

    public void setSwachhBharatCess(float swachhBharatCess) {
        this.swachhBharatCess = swachhBharatCess;
    }

    public float getKrishiKalyanCess() {
        return krishiKalyanCess;
    }

    public void setKrishiKalyanCess(float krishiKalyanCess) {
        this.krishiKalyanCess = krishiKalyanCess;
    }
}
