package boj;
import java.util.*;

public class BOJ9771 { // Word Searching

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int cnt = 0;

        while (sc.hasNextLine()) {
            String[] txt = sc.nextLine().split(" ");

            for (int i = 0; i < txt.length; i++) {
                if (txt[i].contains(word)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}