package main;

import model.User;
import utils.FuncPrint;

public class Main {
    public static void main(String[] args) {
        User person;

        person = new User();

        User user1 = new User(
                1,
                "Виталя",
                45,
                5
        );
        User user2 = new User(
                2,
                "Екатерина",
                64,
                8
        );
        FuncPrint system = new FuncPrint();
        Class1 class1 = new Class1();

        system.print(class1.getDescription());

        system.print("Hello world!");

//        user1.setId(1);;
//        user1.setUsername("Виталя");
//        user1.setHeight(25);
//        user1.setAge(5);

//        user2.setId(2);
//        user2.setUsername("Екатерина");
//        user2.setHeight(64);
//        user2.setAge(8);



        system.print(user1);
        system.print(user1.getUsername());
        system.print(user1.getAge());
        system.print(user1.getHeight());

        system.print(user2);
        system.print(user2.getUsername());
        system.print(user2.getAge());
        system.print(user2.getHeight());


//        user1.grow(2);
//        user2.grow(5);

        system.print(user1);
        system.print(user1.getUsername());
        system.print(user1.getAge());
        system.print(user1.getHeight());

        system.print(user2);
        system.print(user2.getUsername());
        system.print(user2.getAge());
        system.print(user2.getHeight());

        system.print(person);
        system.print(person.getUsername());
        system.print(person.getAge());
        person.grow(3, system);
        system.print(person.getAge());
        system.print(person.getHeight());

    }


}

class Class1 {
    private String description;
    {
        description = "Я описание main.Class1";
    }

    public Class1() {

    }

    public String getDescription() {
        return this.description;

    }
}