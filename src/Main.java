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
        int year = 401;
        if (year %4 ==0 && year %100 !=0 || year %400 ==0)
        {printVesYear(year);}
        else {printNotVesYear(year);}
    }

    public static void main(String[] args) {
        countYearVes();

    }
}