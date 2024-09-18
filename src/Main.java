import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(int yearForCheking) {
        if (yearForCheking >= 1584 && ((yearForCheking % 400 == 0) || (yearForCheking % 100 != 0 && yearForCheking % 4 == 0))) {
            System.out.println(yearForCheking + " год является високосным.");
        } else {
            System.out.println(yearForCheking + " год не является високосным.");
        }
    }

    public static void downloadCorrectOS(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("На доставку потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("На доставку потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {

        //Задача №1
        int year = 2001;
        checkLeapYear(year);
        System.out.println();

        //Задача №2
        int clientOS = 0;
        int clientDeviceYear = 2023;
        downloadCorrectOS(clientOS, clientDeviceYear);
        System.out.println();

        //Задача №3
        int deliveryDistance = 104;
        calculateDeliveryTime(deliveryDistance);
    }
}