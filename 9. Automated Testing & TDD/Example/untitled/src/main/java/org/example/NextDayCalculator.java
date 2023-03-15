package org.example;

public class NextDayCalculator {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }else isLeapYear = true;
        }
        return isLeapYear;
    }
    public static String getNextDayOfMonth(int date, int month, int year) {
        String result = "";
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if(date > 0 && date < 31) {
                    int nextDate = date + 1;
                    result = nextDate + " " + month + " " + year;
                }else if (date == 31) {
                    int nextDate = 1;
                    int nextMonth = month + 1;
                    result = nextDate + " " + nextMonth + " " + year ;
                }else if (date > 31) {
                    result = "Date is false!";
                }
                break;
            case 12:
                if(date > 0 && date < 31) {
                    int nextDate = date + 1;
                    result = nextDate + " " + month + " " + year;
                }else if (date == 31) {
                    int nextDate = 1;
                    int nextMonth = 1;
                    int nextYear = year + 1;
                    result = nextDate + " " + nextMonth + " " + nextYear ;
                }else if (date > 31) {
                    result = "Date is false!";
                }
                break;
            case 2:
                boolean isLeapYear = isLeapYear(year);
                if (isLeapYear) {
                    if(date > 0 && date < 29) {
                        int nextDate = date + 1;
                        result = nextDate + " " + month + " " + year;
                    }else if (date == 29) {
                        int nextDate = 1;
                        int nextMonth = month + 1;
                        result = nextDate + " " + nextMonth + " " + year ;
                    }else if (date > 29) {
                        result = "Date is false!";
                    }
                }else {
                    if(date > 0 && date < 28) {
                        int nextDate = date + 1;
                        result = nextDate + " " + month + " " + year;
                    }else if (date == 28) {
                        int nextDate = 1;
                        int nextMonth = month + 1;
                        result = nextDate + " " + nextMonth + " " + year ;
                    }else if (date > 28) {
                        result = "Date is false!";
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(date > 0 && date < 30) {
                    int nextDate = date + 1;
                    result = nextDate + " " + month + " " + year;
                }else if (date == 30) {
                    int nextDate = 1;
                    int nextMonth = month + 1;
                    result = nextDate + " " + nextMonth + " " + year ;
                }else if (date > 30) {
                    result = "Date is false!";
                }
                break;
            default:
                result = "No Display";
        }
        return result;
    }
}
