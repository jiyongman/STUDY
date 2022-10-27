package boj;
import java.util.*;

public class BOJ7015 { // Millennium

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of data sets

        for (int i = 0; i < n; i++) {
            int Y = sc.nextInt(); // the year of a person's birthdate in the king's calendar
            int M = sc.nextInt(); // the month of a person's birthdate in the king's calendar
            int D = sc.nextInt(); // the day of a person's birthdate in the king's calendar
            int cnt = 0;

            while (Y < 1000) {
                D++;
                cnt++;

                if (Y % 3 == 0 || M % 2 > 0) {
                    if (D > 20) {
                        D = 1;
                        M++;
                    }
                } else {
                    if (D > 19) {
                        D = 1;
                        M++;
                    }
                }

                if (M > 10) {
                    M = 1;
                    Y++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}