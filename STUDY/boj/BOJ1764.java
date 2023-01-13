package boj;
import java.util.*;

public class BOJ1764 { // 듣보잡

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());

        for (String str : list) {
            System.out.println(str);
        }

        sc.close();
    }
}