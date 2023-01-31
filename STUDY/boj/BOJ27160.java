package boj;
import java.util.*;

public class BOJ27160 { // 할리갈리

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String fruit = sc.next();
            int num = sc.nextInt();

            if (!map.containsKey(fruit)) {
                map.put(fruit, num);
            } else {
                map.put(fruit, map.get(fruit) + num);
            }
        }

        if (map.containsValue(5)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}