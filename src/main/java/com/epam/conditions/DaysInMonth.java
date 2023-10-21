package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            int days;
            switch (month) {
                case 1, 3, 5, 7, 10, 12:
                    days = 31;
                    break;
                case 2:
                    if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                default:
                    days = 30;
                    break;
            }
            System.out.println(days);
        }
    }

}
