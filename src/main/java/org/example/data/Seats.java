package org.example.data;

public class Seats {
    String seat_no;
    Boolean seat_availability;
    String seat_category;
    int seat_price;

    public Seats(String seat_no, Boolean seat_availability, String seat_category, int seat_price) {
        this.seat_no = seat_no;
        this.seat_availability = seat_availability;
        this.seat_category = seat_category;
        this.seat_price = seat_price;
    }


    public int getSeat_price() {
        return seat_price;
    }

    public void setSeat_price(int seat_price) {
        this.seat_price = seat_price;
    }


    public String getSeat_category() {
        return seat_category;
    }

    public void setSeat_category(String seat_category) {
        this.seat_category = seat_category;
    }


    public String getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(String seat_no) {
        this.seat_no = seat_no;
    }


    public Boolean getSeat_availability() {
        return seat_availability;
    }

    public void setSeat_availability(Boolean seat_availability) {
        this.seat_availability = seat_availability;
    }


}
