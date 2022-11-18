public class Main {

    public static void printVesYear(int year) {
        System.out.println(year + " год " +
                "является високосным");
    }

    public static void printNotVesYear(int year) {
        System.out.println(year + " год " +
                "не является високосным");
    }

    public static void countYearVes() {
        int year = 400;
        if (year %4 ==0 && year %100 !=0 || year %400 ==0)
        {printVesYear(year);}
        else {printNotVesYear(year);}
    }

    public static void printLiteAndroid () {
        System.out.println("Установите облегченную версию" +
                " приложения для android по ссылке");
    }

    public static void printFullAndroid () {
        System.out.println("Установите обычную версию приложения " +
                "для android по ссылке");
    }
    public static void printLiteIOS () {
        System.out.println("Установите облегченную версию" +
                " приложения для iOS по ссылке");
    }

    public static void printFullIos () {
        System.out.println("Установите обычную версию приложения " +
                "для iOS по ссылке");
    }

    public static void findClientOs () {
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS ==0) {printLiteIOS();}
        else if (clientDeviceYear < 2015 && clientOS ==1) {printLiteAndroid();}
        else if (clientDeviceYear >= 2015 && clientOS ==0) {printFullIos();}
        else if (clientDeviceYear >= 2015 && clientOS ==1) {printFullAndroid();}
    }

    public static void printDeliveryDistance (int day) {
        System.out.println("Потребуется дней: " + day);
    }

    public static int countDeliveryDistance() {
        int deliveryDistance = 400;
        int day;
        if (deliveryDistance <= 20) {day = 1; printDeliveryDistance(day);
            }
        else {day = (deliveryDistance - 20) / 40 + 1;
            printDeliveryDistance(day);}
        return day;
    }

    public static void main(String[] args) {
        countYearVes();
        findClientOs();
        countDeliveryDistance();

    }
}