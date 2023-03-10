package boj;
import java.util.*;

public class BOJ26513 { // Egg Drop

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == 0 && k == 0) {
                break;
            }

            int highest_floor = 1;
            int lowest_floor = k;

            for (int i = 0; i < n; i++) {
                int floor = sc.nextInt();
                String result = sc.next();

                if (result.equals("SAFE")) {
                    highest_floor = Math.max(highest_floor, floor);
                } else {
                    lowest_floor = Math.min(lowest_floor, floor);
                }
            }

            System.out.printf("%d %d\n", highest_floor + 1, lowest_floor - 1);
        }

        sc.close();
    }
}