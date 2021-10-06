package model;

public class Room {
    private String roomNumber;
    private String roomType;
    private double price;
    private boolean isEmpty = true;

    public Room() {
    }

    public Room(String roomNumber, String roomType, double price, boolean isEmty) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isEmpty = isEmty;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Room: " +
                "roomNumber= " + roomNumber + '\'' +
                ", price= " + price;
    }
}
