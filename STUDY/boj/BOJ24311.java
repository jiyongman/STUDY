package boj;
import java.util.*;

public class BOJ24311 { // ПЪТУВАНЕ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt(); // the hour of the start of the technical conference
        int t2 = sc.nextInt(); // the minutes of the start of the technical conference
        int t3 = sc.nextInt(); // registration time in minutes
        int t4 = sc.nextInt(); // travel time in hours
        int t5 = sc.nextInt(); // travel time in minutes
        int br = sc.nextInt(); // number of students
        int t6 = sc.nextInt(); // the minutes required to accommodate one student in the hotel
        int sum = t1 * 60 + t2;
        sum -= t3 + (t4 * 60 + t5) + ((br + 1) * t6) + 10;

        if (sum < 0) {
            sum += 24 * 60;
        }

        int h = sum / 60;
        int m = sum % 60;

        System.out.printf("%02d %02d\n", h, m);
        sc.close();
    }
}