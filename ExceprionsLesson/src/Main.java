import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        try {
//            FileInputStream file = new FileInputStream("file.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e); // вместо е мы можем указать любое свое сообщение. Но нужно быть осторожным в конкретности ошибки
//        }

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int age = scr.nextInt();

        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            print(e.getMessage());
        }

        try {
            int result = divide(a, b);
            print("Результат деления: " + result);
        } catch (ArithmeticException e) {
            print("Ошибка деления на нуль.");
        } finally {
            print("Спасибо, что выбераете нас!");
        }

        int res = divide(10, 5);
        print("res: " + res);

        System.out.println();

        Throwable throwable = new Throwable();
        Error error = new Error();
        Exception exception = new Exception();
        RuntimeException runtimeexception = new RuntimeException();
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    static void print(String mes) {
        System.out.println(mes);
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Возраст должен быть больше 17");
        }
    }
}