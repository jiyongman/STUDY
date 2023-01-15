package boj;
import java.util.*;

public class BOJ9375 { // 패션왕 신해빈

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String[] arr = sc.nextLine().split(" ");
                map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            }

            int result = 1;

            for (String key : map.keySet()) {
                result *= map.get(key) + 1;
            }

            result -= 1;

            System.out.println(result);
        }

        sc.close();
    }
}