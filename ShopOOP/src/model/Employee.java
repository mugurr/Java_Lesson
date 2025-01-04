package model;

import main.Main;

public class Employee extends User {

    private long tabNumber;

    public Employee(int id, String country, int age, long tabNumber) {
        super(id, country, age);
        this.tabNumber = tabNumber;
    }

    public String getEmployeeCard() {
        return "\nUsername: " + this.getUsername()
                + "\nCountry: " + this.getCountry()
                + "\nAge: " + this.getAge()
                + "\ntabNumber: " + this.tabNumber;
    }

    @Override
    public String getPass() {
        Main.logger.log();
        return "\nUsername: " + this.getUsername()
                + "\nCountry: " + this.getCountry()
                + "\nAge: " + this.getAge()
                + "\ntabNumber: " + this.tabNumber;
    }

    private long getTabNumber() {
        return this.tabNumber;
    }

    public void addProductByPosition() {
        // TODO
    }

    public void deleteProductByPosition() {
        // TODO
    }
}
