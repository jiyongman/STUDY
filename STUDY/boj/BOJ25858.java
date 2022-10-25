package boj;
import java.util.*;

public class BOJ25858 { // Divide the Cash

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the number of team members
        int d = sc.nextInt(); // the dollar amount to be divided among the students
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // the number of problems a team member has solved
            sum += arr[i];
        }

        int p = d / sum;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] * p);
        }

        sc.close();
    }
}