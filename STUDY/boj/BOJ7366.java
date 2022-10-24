package boj;
import java.util.*;

public class BOJ7366 { // Counting Sheep

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // the number of problem instances

        for (int i = 1; i <= n; i++) {
            int m = Integer.parseInt(sc.nextLine());
            String[] arr = sc.nextLine().split(" ");
            int cnt = 0;

            for (int j = 0; j < m; j++) {
                if (arr[j].equals("sheep")) {
                    cnt++;
                }
            }

            System.out.printf("Case %d: This list contains %d sheep.\n\n", i, cnt);
        }

        sc.close();
    }
}