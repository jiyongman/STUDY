package boj;
import java.util.*;

public class BOJ17850 { // Make America Grade Again

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int l = Integer.parseInt(st.nextToken()); // the percentages for labs
        int h = Integer.parseInt(st.nextToken()); // the percentages for homeworks
        int p = Integer.parseInt(st.nextToken()); // the percentages for projects
        int e = Integer.parseInt(st.nextToken()); // the percentages for exams
        int n = Integer.parseInt(st.nextToken()); // the number of graded assignments
        double[] r = new double[4];
        double[] s = new double[4];

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            String[] num = arr[2].split("/");

            if (arr[0].equals("Lab")) {
                r[0] += Integer.parseInt(num[0]);
                s[0] += Integer.parseInt(num[1]);
            } else if (arr[0].equals("Hw")) {
                r[1] += Integer.parseInt(num[0]);
                s[1] += Integer.parseInt(num[1]);
            } else if (arr[0].equals("Proj")) {
                r[2] += Integer.parseInt(num[0]);
                s[2] += Integer.parseInt(num[1]);
            } else {
                r[3] += Integer.parseInt(num[0]);
                s[3] += Integer.parseInt(num[1]);
            }
        }

        double grade = l * r[0] / s[0] + h * r[1] / s[1] + p * r[2] / s[2] + e * r[3] / s[3];

        System.out.println((int) grade);
        sc.close();
    }
}