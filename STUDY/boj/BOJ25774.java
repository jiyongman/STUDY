package boj;
import java.util.*;

public class BOJ25774 { // Simplified Calendar System

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // what day of the month the first date is
        int m = sc.nextInt(); // what month of the year the first date is
        int y = sc.nextInt(); // what year the first date is
        int n = sc.nextInt(); // what day of the week the given date is
        int d2 = sc.nextInt(); // what day of the month the second date is
        int m2 = sc.nextInt(); // what month of the year the second date is
        int y2 = sc.nextInt(); // what year the second date is
        int day = (y2 - y) * 360 + (m2 - m) * 30 + d2 - d;
        int date = day % 7 + n;

        if (date > 7) {
            date -= 7;
        }

        System.out.println(date);
        sc.close();
    }
}