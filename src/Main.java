public class Main {
    public static void main(String[] args) {

        //task 1//

        int year = 2120;
        statusOfYear(year);
    }
    public static void statusOfYear (int year) {
        if (year % 4 == 0 && year/100 !=0) {System.out.println(year + " год является високосным");}
        else {System.out.println(year + " год не является високосным");}
        return;
    }

        //task 2//

        int clientDeviceYear = 2015;
        int ios = 0;
        int android = 1;
        int clientIOS = 1;
        String OcVersion = new String();
public static void VarOcClient (int android, int ios, int clientIOS){
        if(clientIOS == ios) {
           String Oc
        }
        if(clientIOS == android &&clientDeviceYear >=2015)
        {
            System.out.println("Установите версию приложения для android по ссылке");
        }
        if(clientIOS ==ios &&clientDeviceYear<2015)
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if(clientIOS ==android &&clientDeviceYear<2015)
        {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }
}