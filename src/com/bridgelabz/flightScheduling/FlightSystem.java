package com.bridgelabz.flightScheduling;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "New York", "London");
        Flight<String> flight2 = new Flight<>("AA202", "Los Angeles", "Tokyo");

        Booking<Integer> booking1 = new Booking<>(5001, flight1, "John Doe");
        Booking<String> booking2 = new Booking<>("B102", flight2, "Jane Smith");

        booking1.displayBookingInfo();
        System.out.println("----------------");
        booking2.displayBookingInfo();

        System.out.println("\n--- Flight Management ---");
        FlightManager<Integer> manager1 = new FlightManager<>();
        manager1.addFlight(flight1);
        manager1.displayAllFlights();

        FlightManager<String> manager2 = new FlightManager<>();
        manager2.addFlight(flight2);
        manager2.displayAllFlights();
    }
}


