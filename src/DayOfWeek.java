public class DayOfWeek {

    boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    int[] daysMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public int dayOfWeek(int year, int month, int day) {
        int dayGivenYear = 0;
        int result = 0;

        dayGivenYear = day + daysMonth[month - 1];
        if (month > 2 && isLeap(year))
            dayGivenYear++;



        return 0;
    }
}


//    Napisz funckję
//    int dayOfWeek(int year, int month, int day)
//    która określa jaki dzień tygodnia będzie podanego dnia i zwraca wartość od 0 do 6.
//        Sposób dowolny.