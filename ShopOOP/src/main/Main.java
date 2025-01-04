package main;

import service.impl.StorageImpl;
import utils.Logger;
import model.*;
import utils.FuncPrint;
import utils.TimeLogger;
import service.Storage;

public class Main {
    public static Logger logger;

    public static void main(String[] args) {

        logger = new TimeLogger();

//        System.out.println("Привет, магазин!");

        Storage storage = new StorageImpl();

        // способ 1
        Product[] productsOne = new Product[3];
//        System.out.println(Arrays.toString(productsOne));

        productsOne[0] = new Product(
                "table",
                0,
                5
        );

        productsOne[1] = new Product(
                "chair",
                1,
                10
        );

        productsOne[2] = new Product(
                "bookshelf",
                2,
                3
        );

        //способ 2
        Product[] productsTwo = {
                new Product("table", 0, 5),
                new Product("chair", 1, 10),
                new Product("bookshelf", 2, 3)
        };

        // Реаализовать переезд на новый склад/расширение склада (написать решение для расширения массива)
        // Product newStorage = Storage.addNewStorage();

        // Реализовать пополнение товаров на складе

        //способ 3
        Product table = new Product("table", 0, 5);
        Product chair = new Product("chair", 1, 10);
        Product bookshelf = new Product("bookshelf", 2, 3);

        Product[] productsThree = new Product[3];


        storage.addProduct(productsThree, table);
        storage.addProduct(productsThree, chair);
        storage.addProduct(productsThree, bookshelf);

//        System.out.println(Arrays.toString(productsOne));
//        System.out.println(Arrays.toString(productsTwo));
//        System.out.println(Arrays.toString(productsThree));

        storage.getProducts(productsThree);

        storage.buyProducts(productsThree, table);

        storage.getProducts(productsThree);

        Employee employee1 = new Employee(
                1,
                "Russia",
                24,
                1L
        );

        Employee employee2 = new Employee(
                2,
                "Russia",
                30,
                2L
        );
//        System.out.println("Employee age: " + employee1.getAge());
//        System.out.println("Employee tabNumber: " + employee1.getUsername());
//        System.out.println(employee1.getEmployeeCard());
//        System.out.println(employee2.getEmployeeCard());


        Buyer buyer1 = new Buyer(
                1,
                "Russia",
                -1,
                "Вася",
                "Kazan"
        );

        Buyer buyer2 = new Buyer(
                2,
                "French",
                -1,
                "Василиса",
                "Paris"
        );

//        System.out.println(buyer1.getAge());

        Employee employee3 = new Employee(
                2,
                "Russia",
                -30,
                2L
        );

//        System.out.println(employee3.getAge());

        User user1 = new Buyer(
                1,
                "French",
                -1,
                "Василиса",
                "Paris"
        );


        User user2 = new Employee(
                3,
                "Russia",
                -30,
                3L
        );

        Buyer buyer3 = new Buyer(
                2,
                "French",
                -1,
                "Вадим",
                "Paris"
        );

//        System.out.println(buyer3.getAge());
//        System.out.println(buyer3.getUsername());

        User child1 = new Child(
                2,
                "French",
                -1,
                "Марина",
                "Paris"
        );

//        System.out.println(child1.getAge());

        Student student1 = new Student(
                1,
                "Russia",
                8,
                "Ваня",
                "Школа 1"
        );

//        System.out.println("Student: " + student1.getAge());

        User[] arrayUsers = new User[] {
                employee1,
                employee2,
                employee3,
                buyer1,
                buyer2,
                buyer3,
                child1,
                student1
        };

//        FuncPrint.print("arrayUsers[0]: " + arrayUsers[0].getAge());
//        FuncPrint.print("arrayUsers[6]: " + arrayUsers[6].getAge());
//        FuncPrint.print("arrayUsers[7]: " + arrayUsers[7].getAge());

//        for (User user : arrayUsers) {
//            FuncPrint.print(user.getUsername());
//        }

//        Person person1 = new Person("Maria");

        for (User user : arrayUsers) {
            FuncPrint.print(user.getPass());
        }

        // преобразование типов
        FuncPrint.print("arrayUsers[0]: " + ((Employee)arrayUsers[0]).getCountry());

    }


}