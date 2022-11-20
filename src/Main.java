public class Main {
    public static void amount (int day, int deliveryDistance) {
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = 3;
        }
        {
            System.out.println("Потребуется дней:" + day);
        }
    }
    public static void statusOfYear ( int y){
        if (y % 4 == 0 && y / 100 != 0) {
            System.out.println(y + " год является високосным");
        } else {
            System.out.println(y + " год не является високосным");
        }
    }
    public static void varOcClient (int client, int clientDeviceYear){
        if (client == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (client != 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для android по ссылке");
        }
        if (client == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (client != 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }

    }
    public static void main(String[] args) {
        //task 1//
        int year = 2120;
        statusOfYear(year);

        //task 2//

        int clientDeviceYear = 2014;
        int client = 0;
        varOcClient(client,clientDeviceYear);

        //task 3//

        int deliveryDistance = 95;
        int day =1;
        amount(day,deliveryDistance);
    }

}