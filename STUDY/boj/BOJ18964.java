package boj;
import java.util.*;

public class BOJ18964 { // Questionnaire

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of ACM ICPC participants
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // the numbers chosen by the participants

            if (a % 2 > 0) {
                cnt++;
            }
        }

        if (n % 2 > 0) {
            if (cnt >= n / 2 + 1) {
                System.out.println(2 + " " + 1);
            } else {
                System.out.println(2 + " " + 0);
            }
        } else {
            if (cnt >= n / 2) {
                System.out.println(2 + " " + 1);
            } else {
                System.out.println(2 + " " + 0);
            }
        }

        sc.close();
    }
}