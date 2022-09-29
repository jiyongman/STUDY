package boj;
import java.util.*;

public class BOJ22123 { // Экзамен

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of tests

        for (int i = 0; i < n; i++) {
            String S = sc.next(); // the start times of the exam
            String F = sc.next(); // the end times of the exam
            int k = sc.nextInt(); // the time in minutes for Igor to write the program
            int t1 = Integer.parseInt(S.substring(0, 2)) * 3600 + Integer.parseInt(S.substring(3, 5)) * 60 + Integer.parseInt(S.substring(6));
            int t2 = Integer.parseInt(F.substring(0, 2)) * 3600 + Integer.parseInt(F.substring(3, 5)) * 60 + Integer.parseInt(F.substring(6));
            int t = t2 - t1;

            if (t <= 0) {
                t += 86400;
            }

            if (t >= k * 60) {
                System.out.println("Perfect");
            } else if (t < k * 60 - 3600) {
                System.out.println("Fail");
            } else {
                System.out.println("Test");
            }

        }

        sc.close();
    }
}