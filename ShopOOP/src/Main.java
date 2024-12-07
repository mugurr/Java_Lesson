import model.Product;
import model.Storage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, магазин!");

        Storage storage = new Storage();

        // способ 1
        Product[] productsOne = new Product[3];
        System.out.println(Arrays.toString(productsOne));

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


        storage.addProducts(productsThree, table);
        storage.addProducts(productsThree, chair);
        storage.addProducts(productsThree, bookshelf);

        System.out.println(Arrays.toString(productsOne));
        System.out.println(Arrays.toString(productsTwo));
        System.out.println(Arrays.toString(productsThree));

        storage.getProducts(productsThree);

        storage.buyProducts(productsThree, table);

        storage.getProducts(productsThree);

    }


}