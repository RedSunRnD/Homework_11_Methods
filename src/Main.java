import java.time.LocalDate;

public class Main {


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
        int deliveryDistance = -5;
        if (deliveryDistance < 0) {
            throw new RuntimeException("Неверно введено расстояние.");
        }
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static void checkLeapYear(int yearForChecking) {
        if (yearForChecking >= 1584 && ((yearForChecking % 400 == 0) || (yearForChecking % 100 != 0 && yearForChecking % 4 == 0))) {
            System.out.println(yearForChecking + " год является високосным.");
        } else {
            System.out.println(yearForChecking + " год не является високосным.");
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

    public static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            deliveryDistance = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDistance = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDistance = 3;
        } else if (deliveryDistance > 100) {
            deliveryDistance = 0;
        }
        return deliveryDistance;
    }
}