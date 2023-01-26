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
        boolean isYearLeap = y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
        return isYearLeap;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2022;
        suggestDownload(clientOS, clientDeviceYear);
    }

    public static void suggestDownload(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int determineDeliveryTime(int distance) {
        int days;
        if (distance > 0 && distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        } else {
            days = 0;
        }
        return days;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = determineDeliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
}