public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() { //task with app and system OS
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() { //task with app and system OS and year
        System.out.println("Задача 2");
        byte clientOS = 0;
        short clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }
    public static void task3() { //year with 366 days
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() { //delivery
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        System.out.println("Ваша дистанция для доставки: " + deliveryDistance);
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней для доставки: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней для доставки: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней для доставки: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5() { //seasons of the year
        System.out.println("Задача 5");
        byte month = 5;
        switch (month) {
            case 1,2,12:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Неверный номер месяца");
        }
    }
}