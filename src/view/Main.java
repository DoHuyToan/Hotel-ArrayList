package view;

import controller.Hotel;
import model.Customer;
import model.Order;
import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("001", "Vip", 100, true);
        Room room2 = new Room("002", "Vip", 100, true);
        Room room3 = new Room("003", "Normal", 70, true);
        Room room4 = new Room("004", "Normal", 70, true);
        Room room5 = new Room("005", "Normal", 70, true);
        ArrayList<Room> roomArrayList = new ArrayList<>();
        roomArrayList.add(room1);
        roomArrayList.add(room2);
        roomArrayList.add(room3);
        roomArrayList.add(room4);
        roomArrayList.add(room5);

        Customer Duy = new Customer("Duy", "1/1/1991", "11111");
        Customer Dinh = new Customer("Dinh", "1/1/1998", "22222");
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        customerArrayList.add(Duy);
        customerArrayList.add(Dinh);

        Order order1 = new Order(LocalDate.of(2021, 10, 1), LocalDate.of(2021, 10,6),room1, Dinh);
        ArrayList<Order> orderArrayList = new ArrayList<>();
        orderArrayList.add(order1);

        Hotel toanHotel = new Hotel(orderArrayList, customerArrayList, roomArrayList);

        toanHotel.checkRoom("001");

        toanHotel.displayCustomer();
        toanHotel.addCustomer(new Customer("Tuan", "1/1/1997", "33333"));
        toanHotel.displayCustomer();
        toanHotel.removeCustomer("33333");
        toanHotel.displayCustomer();
        toanHotel.editCustomer("22222", new Customer("Tuan", "1/1/1997", "33333"));
        toanHotel.displayCustomer();

        toanHotel.displayRoom();
        toanHotel.addRoom(new Room("006", "Vip", 100, true));
        toanHotel.displayRoom();
        toanHotel.removeRoom("006");
        toanHotel.displayRoom();
        toanHotel.editeRoom("005", new Room("006", "Vip", 100, true));
        toanHotel.displayRoom();

        toanHotel.displayOrder();
        toanHotel.findRoomByName("Dinh");




    }

}
