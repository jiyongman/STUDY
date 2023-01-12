package boj;
import java.util.*;

public class BOJ1181 { // 단어 정렬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] word = new String[N];

        for (int i = 0; i < N; i++) {
            word[i] = sc.next();
        }

        Arrays.sort(word, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        System.out.println(word[0]);

        for (int i = 1; i < N; i++) {
            if (!word[i - 1].equals(word[i])) {
                System.out.println(word[i]);
            }
        }

        sc.close();
    }
}