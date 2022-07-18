package boj;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BOJ16170 { // 오늘의 날짜는?

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC")); // UTC + 0
        System.out.println(zonedDateTime.getYear()); // 연도
        System.out.println(zonedDateTime.getMonthValue()); // 월
        System.out.println(zonedDateTime.getDayOfMonth()); // 일
    }
}