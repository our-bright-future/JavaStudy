package week1.subject2.ex1;

import java.util.Calendar;

public class MyDate {

    private int day;
    public int month;
    public int year;

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isLeapYear1() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }

    private boolean isLeapYear2() {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public String isValid() {
        boolean isLeap = isLeapYear2();
        boolean isValid;

        if (month < 1 || 12 < month || day < 1)
            return getInfo() + "은 유효하지 않은 날짜입니다.";

        else if (month == 2 && !(day < (isLeap ? 30 : 29)))
            return getInfo() + "은 유효하지 않은 날짜입니다.";

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (31 < day)
                    return getInfo() + "은 유효하지 않은 날짜입니다.";
                break;
            case 4, 6, 9, 11:
                if (30 < day)
                    return getInfo() + "은 유효하지 않은 날짜입니다.";
        }

        return getInfo() + "은 유효한 날짜입니다.";
    }

    public String getInfo() {
        return year + "년 " + month + "월 " + day + "일";
    }
}
