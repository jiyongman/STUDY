package boj;
import java.util.*;

public class BOJ10410 { // Eligibility

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            String str = "";

            if (Integer.parseInt(arr[1].substring(0, 4)) >= 2010) {
                str = "eligible";
            } else if (Integer.parseInt(arr[2].substring(0, 4)) >= 1991) {
                str = "eligible";
            } else if (Integer.parseInt(arr[3]) >= 41) {
                str = "ineligible";
            } else {
                str = "coach petitions";
            }

            System.out.printf("%s %s\n", arr[0], str);
        }

        sc.close();
    }
}