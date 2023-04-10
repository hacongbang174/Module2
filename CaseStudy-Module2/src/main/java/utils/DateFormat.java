package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    private static String pattern = "dd/MM/yyyy";
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    public static Date parseDate(String strDate) {
        try {
            return simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Invalid format");
            return null;
        }
    }
    public static String convertDateToString(Date date) {
        return simpleDateFormat.format(date);
    }
    public static void main(String[] args) {
        String a = "17/04/1994";
        Date b = DateFormat.parseDate(a);
        System.out.println(b);
        String c = DateFormat.convertDateToString(b);
        System.out.println(c);
    }
}
