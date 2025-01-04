package model;

import main.Main;


public class Buyer extends User {
    private String cardNumber;
    private String address;

    public Buyer(int id, String country, int age, String username, String address) {
        super(id, country, age, username);
        this.address = address;
    }

    @Override
    public int getAge() {
        if (super.getAge() < 0) {
            System.out.println("\nВозраст меньше 0 не допустим. User: " + super.getUsername());
            return 1;
        } else return super.getAge();
    }

    @Override
    public String getPass() {
        Main.logger.log();
        return "\nUsername: " + this.getUsername()
                + "\nCountry: " + this.getCountry()
                + "\nAge: " + this.getAge()
                + "\nAdress: " + this.getAddress();
    }

    public String getAddress() {
        return address;
    }

    public Order buyProduct(String cardNumber) {
        return new Order(this.address);
    }
}
