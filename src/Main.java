public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        int clientOS = 1;
        ;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по cсылке ");
        } else {
            System.out.println(" Установите версию приложения для Android по cсылке ");
        }
        System.out.println(" Задача 2 ");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по cсылке ");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по cсылке ");
        }
        System.out.println(" Задача 3 ");
        int year = 2021;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "год является високосным");
            } else {
                System.out.println(year + " год не является високосным ");
            }
        }
        System.out.println(" Задача 4 ");
        int deliveryDistance = 95;
        int dey = 1;
        if (deliveryDistance > 100) {
            System.out.println(" Доставки нет ");
        } else {
            if (deliveryDistance > 20) {
                dey++;
            }
            if (deliveryDistance > 60) {
                dey++;
            }
            System.out.println("Потребуется дней: " + dey);
        }
        System.out.println(" Задача 5 ");

        int monthNumber = 12;

        if (monthNumber > 12) {
            System.out.println(" Программа не работает. ");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println(" Зима ");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(" Весна ");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(" Лето ");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(" Осень ");
                    break;
                default:
                    System.out.println(" Не знаем такого месяца ");
            }
        }

    }

}