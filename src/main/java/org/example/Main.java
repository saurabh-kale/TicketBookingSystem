package org.example;

import org.example.data.*;

import java.util.*;


class DisplayData {

    void display(List<Shows> showsList) {
        for (Shows shows : showsList) {
            System.out.println("Show " + shows.getShow_id() + " Running in Audi " + shows.getShow_id());
            System.out.println("All Seats");
            List<Seats> seatsList = shows.getSeats();
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            for (Seats seats : seatsList) {
                String seat_key = String.valueOf(seats.getSeat_no().charAt(0));
                String seat_value = "";
                if (linkedHashMap.containsKey(seat_key)) {
                    seat_value = linkedHashMap.get(seat_key);
                }
                if (seats.getSeat_availability()) {
                    seat_value += " " + seats.getSeat_no();
                } else {
                    seat_value += "   ";
                }
                linkedHashMap.put(seat_key, seat_value);
            }
            for (String s : linkedHashMap.values()) {
                System.out.println(s);
            }
            System.out.println();

        }
    }
}

public class Main {
    public static void main(String[] args) {

        // create object of Util class.
        Util util = new Util();

        // create object of display data class to display the show and seats list.
        DisplayData displayData = new DisplayData();

        // bookingsList holds all the bookings made by the user.
        List<Bookings> bookingsList = new ArrayList<>();

        // showsList holds all the show's data including seats of the show.
        List<Shows> showsList = new ArrayList<>();
        Constants.setShowsData(showsList);

        int choice;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("1.Proceed with booking \n 2.Exit \n");
            System.out.println("Enter your Choice : ");
            choice = -1;

            Scanner sc = new Scanner(System.in);

            // scanner object to get user inputs.

            // validate the next thing in your scanner is an int
            // otherwise, scanner.nextInt() might cause an exception
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        // show all the show's data with seats of the show.
                        System.out.println();
                        displayData.display(showsList);
                        System.out.println();

                        Scanner scanner = new Scanner(System.in);

                        //show no stores the show entered by user to book the ticket.
                        System.out.println("Enter Show no : ");
                        String show_no = scanner.nextLine();
                        System.out.println();

                        if (util.checkIfShowExists(showsList, show_no)) {


                            while (true) {
                                // get seats input from the user.
                                System.out.println("Enter Seats: ");
                                String seats_input = scanner.nextLine();

                                // hashmap of seats selected to get the data which seats are not available.
                                HashMap<String, Boolean> seats_selected = new HashMap<>();

                                // split user input by "," and add data to seats_selected.
                                String[] temp = seats_input.split(",");
                                for (String value : temp) {
                                    seats_selected.put(value, true);
                                }

                                if (util.checkIfAllSeatsAreAvailable(showsList, show_no, seats_selected)) {
                                    // set seats_available_flag to true.

                                    int subTotal = util.getSubTotal(seats_selected, showsList, show_no);

                                    for (String s : seats_selected.keySet()) {
                                        for (Shows shows : showsList) {
                                            if (shows.getShow_id() == Integer.parseInt(show_no)) {
                                                for (Seats seats : shows.getSeats()) {
                                                    if (s.equals(seats.getSeat_no())) {
                                                        seats.setSeat_availability(false);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    System.out.println();
                                    System.out.println("Successfully Booked - Show " + show_no);
                                    System.out.println("Subtotal :" + subTotal);
                                    float service_tax = Constants.calculateServiceTax(subTotal);
                                    System.out.println("Service Tax: @" + Constants.service_tax + ": " + service_tax);
                                    float swachh_bharat_cess = Constants.calculateSwachhBharatCess(subTotal);
                                    System.out.println("Swachh Bharat Cess @" + Constants.swachh_bharat_cess + ": " + swachh_bharat_cess);
                                    float krishi_kalyan_cess = Constants.calculateKrishiKalyanCess(subTotal);
                                    System.out.println("Krishi Kalyan Cess @" + Constants.krishi_kalyan_cess + ": " + krishi_kalyan_cess);
                                    float total = Constants.calculateTotal(subTotal, service_tax, swachh_bharat_cess, krishi_kalyan_cess);
                                    System.out.println("Total :" + total);

                                    bookingsList.add(new Bookings(Integer.parseInt(show_no), seats_selected.keySet(), subTotal, service_tax, swachh_bharat_cess, krishi_kalyan_cess));
                                    System.out.println();
                                    util.calculateTotalRevenue(bookingsList);
                                    System.out.println();
                                    System.out.println();

                                    break;
                                } else {
                                    for (String s : seats_selected.keySet()) {
                                        // print the not available seat.
                                        if (!seats_selected.get(s)) {
                                            System.out.println(s + " Not available, Please select different seats");
                                            System.out.println();
                                        }
                                    }
                                }

                            }


                        } else {
                            System.out.println("Invalid show. Please try again!");
                        }
                        break;
                    }
                    case 2:
                        System.out.println("Exiting !!!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Try again");
                        break;
                }
            }
        } while (choice == 1);

    }
}