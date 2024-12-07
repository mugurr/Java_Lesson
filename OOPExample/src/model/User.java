package model;
import utils.FuncPrint;

public class User {
    private int id;
    private String username;
    private int height;
    private int age;
    private FuncPrint print;



    private double check;

    public void grow(int age, FuncPrint print) {
        this.age+=age;
        this.height = this.age * age;
        print.print(age);
    }

    {
        id = 0;
        username = "Admin";
        height = 100;
        age = 100;
    }

    public User(int id, String username, int height, int age) {
        System.out.println("Работа инициализатора: " + this.height);
        this.id = id;
        this.username = username;
        this.height = height;
        this.age = age;
        System.out.println("Работа коснструктора: " + this.height);
    }

    public User(String username) {
        this.id = 100;
        this.username = username;
        this.height = 10;
        this.age = this.height;
    }

    public User() {
        this(0, "Admin", 100, 100);
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public int getHeight() {
        return height;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setHeight(int height) {
        if (height == 0 || height <0) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }


}
