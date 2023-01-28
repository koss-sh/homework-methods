import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        boolean yearLeap = checkYearLeap(year);
        if (yearLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static boolean checkYearLeap(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        suggestDownload(clientOS, clientDeviceYear);
    }

    public static void suggestDownload(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int determineDeliveryTime(int distance) {
        if (distance > 0 && distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = -5;
        int deliveryTime = determineDeliveryTime(deliveryDistance);
        if (deliveryTime == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}