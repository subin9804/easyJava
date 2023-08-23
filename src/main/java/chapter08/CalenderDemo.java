package chapter08;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.printf("오늘은 %d년 %d월 %d일 입니다. \n",
                c.get(Calendar.YEAR),
                c.get(Calendar.MONTH + 1),
                c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.getFirstDayOfWeek());
    }
}
