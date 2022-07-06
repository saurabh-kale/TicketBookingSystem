package org.example.data;

import java.util.List;

public class Shows {

    public Shows(int show_id, List<Seats> seats) {
        this.show_id = show_id;
        this.seats = seats;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    int show_id;
    List<Seats> seats;


    public List<Seats> getSeats() {
        return seats;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }

}
