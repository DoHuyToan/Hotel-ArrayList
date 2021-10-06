package controller;

import model.Customer;
import model.Order;
import model.Room;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Order> orderArrayList = new ArrayList<>();
    ArrayList<Customer> customerArrayList =new ArrayList<>();
    ArrayList<Room> roomArrayList = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(ArrayList<Order> orderArrayList, ArrayList<Customer> customerArrayList, ArrayList<Room> roomArrayList) {
        this.orderArrayList = orderArrayList;
        this.customerArrayList = customerArrayList;
        this.roomArrayList = roomArrayList;
    }

    public void displayOrder(){
        for (Order order: orderArrayList) {
            System.out.println(order);
        }
    }

    public void displayRoom(){
        for (Room room:roomArrayList) {
            System.out.println(room);
        }
    }

    public void displayCustomer(){
        for (Customer customer:customerArrayList) {
            System.out.println(customer);
        }
    }

    public void checkRoom(String roomNumber){
        for (int i=0; i<roomArrayList.size(); i++){
            if(roomArrayList.get(i).getRoomNumber().equals(roomNumber)){
                if(roomArrayList.get(i).isEmpty()){
                    System.out.println("Phòng trống");
                    break;
                }
                else System.out.println("Phòng đã có khách");
            }
        }
    }

    public void addRoom(Room room){
        roomArrayList.add(room);
    }

    public void removeRoom(String roomNumber){
        for (int i=0; i< roomArrayList.size(); i++){
            if (roomArrayList.get(i).getRoomNumber().equals(roomNumber))
                roomArrayList.remove(i);
        }
    }

    public void editeRoom(String roomNumber, Room room){
        for (int i=0; i< roomArrayList.size(); i++){
            if (roomArrayList.get(i).getRoomNumber().equals(roomNumber))
                roomArrayList.set(i, room);
        }
    }

    public void addCustomer(Customer customer){
        customerArrayList.add(customer);
    }

    public void removeCustomer(String identityCard){
        for (int i=0; i<customerArrayList.size(); i++){
            if (customerArrayList.get(i).getIdentityCard().equals(identityCard))
                customerArrayList.remove(i);
        }
    }

    public void editCustomer(String identityCard, Customer customer){
        for (int i=0; i<customerArrayList.size(); i++){
            if (customerArrayList.get(i).getIdentityCard().equals(identityCard))
                customerArrayList.set(i, customer);
        }
    }

    public double getAllTotalPrice(){
        double total = 0;
        for (Order order: orderArrayList) {
            total += order.getTotalPrice();
        }
        return total;
    }

    public void findRoomByName(String name){
        for (int i=0; i<orderArrayList.size(); i++){
            if (orderArrayList.get(i).getCustomer().getName().equals(name))
                System.out.println(orderArrayList.get(i).getRoom());
        }
    }


    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void setOrderArrayList(ArrayList<Order> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

    public void setRoomArrayList(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }
}