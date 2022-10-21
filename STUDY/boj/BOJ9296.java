package boj;
import java.util.*;

public class BOJ9296 { // Grading Exams

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // the number of test cases

        for (int x = 1; x <= T; x++) {
            int L = sc.nextInt(); // the number of questions on the exam
            String str = sc.next(); // the correct answer
            String str2 = sc.next(); // the student’s responses
            int cnt = 0;

            for (int i = 0; i < L; i++) {
                if (str.charAt(i) != str2.charAt(i)) {
                    cnt++;
                }
            }

            System.out.printf("Case %d: %d\n", x, cnt);
        }

        sc.close();
    }
}