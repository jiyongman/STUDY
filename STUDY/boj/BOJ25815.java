package boj;
import java.util.*;

public class BOJ25815 { // Cat’s Age

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(); // the year part of the cat’s age
        int m = sc.nextInt(); // the month part of the cat’s age
        int year = 0; // the cat’s age in human age (year)
        int month = 0; // the cat’s age in human age (month)

        if (y < 1) {
            month += m * 15;
        } else if (y < 2) {
            year += 15;
            month += m * 9;
        } else {
            year += 24 + (y - 2) * 4;
            month += m * 4;
        }

        year += month / 12;
        month %= 12;

        System.out.printf("%d %d", year, month);
        sc.close();
    }
}