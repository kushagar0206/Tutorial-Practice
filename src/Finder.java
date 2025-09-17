

public class Finder {
    public static void main(String[] args) {
        //Find the number of year number of week and number of days

        int a = 364;
        int daysInYear = 365;
        int daysInWeek = 7;

        int year = a / daysInYear;
        int totalDays = a - (year * daysInYear);
        int week = totalDays / daysInWeek;
        int days = totalDays - (week * daysInWeek) ;

        System.out.println("Year: " + year);
        System.out.println("Week: " + week);
        System.out.println("Days: " + days);


    }
}
