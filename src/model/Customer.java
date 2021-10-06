package model;

public class Customer {
    private String name;
    private String birthDay;
    private String identityCard;

    public Customer() {
    }

    public Customer(String name, String birthDay, String identityCard) {
        this.name = name;
        this.birthDay = birthDay;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "name= " + name + '\'' +
                ", identityCard= " + identityCard;
    }
}
