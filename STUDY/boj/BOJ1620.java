package boj;
import java.util.*;

public class BOJ1620 { // 나는야 포켓몬 마스터 이다솜

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = sc.next();
            map.put(str, String.valueOf(i));
            map.put(String.valueOf(i), str);
        }

        for (int i = 0; i < M; i++) {
            String str = sc.next();
            System.out.println(map.get(str));
        }

        sc.close();
    }
}