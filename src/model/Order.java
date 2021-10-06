package model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order {
    private Customer customer;
    private Room room;
    private LocalDate checkin;
    private LocalDate checkout;

    public Order() {
    }

    public Order(LocalDate checkin, LocalDate checkout, Room room, Customer customer) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.room = room;
        this.customer = customer;
        this.room.setEmpty(false);
    }

    public double getTotalPrice(){
        double numDay = DAYS.between(checkin, checkout);
        double price = room.getPrice();
        double total = numDay * price;
        return total;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order: " +
                customer.toString() + " / " + room.toString() +
                ", checkout= " + checkout +
                ", totalPrice= " + getTotalPrice();
    }
}
