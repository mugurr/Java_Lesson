package model;

public class Student extends User {
    public Student(int id, String country, int age, String username) {
        super(id, country, age, username);
    }

    public int getAge() {
        return super.getAge();
    }

}
