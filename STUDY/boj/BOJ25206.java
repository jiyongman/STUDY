package boj;
import java.util.*;

public class BOJ25206 { // 너의 평점은

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] credit = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double sum = 0.0;
        double sum_credit = 0.0;

        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");

            for (int i = 0; i < grade.length; i++) {
                if (arr[2].equals(grade[i])) {
                    sum += Double.parseDouble(arr[1]) * credit[i];
                    sum_credit += Double.parseDouble(arr[1]);
                }
            }
        }

        double avg = sum / sum_credit;

        System.out.printf("%.06f", avg);
        sc.close();
    }
}