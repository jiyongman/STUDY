package boj;
import java.util.*;

public class BOJ20735 { // Fifty Shades of Pink

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of button packages in the box
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next().toLowerCase();

            if (str.contains("pink") || str.contains("rose")) {
                cnt++;
            }
        }

        if (cnt > 0) {
            System.out.println(cnt);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }

        sc.close();
    }
}