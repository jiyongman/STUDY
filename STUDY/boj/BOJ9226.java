package boj;
import java.util.*;

public class BOJ9226 { // 도깨비말

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            int tmp = 0;
            int cnt = 0;
            String str2 = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    tmp = i;
                    cnt++;
                    break;
                } else {
                    str2 += ch;
                }
            }

            for (int i = tmp; i < str.length(); i++) {
                if (tmp == 0 && cnt == 0) {
                    break;
                } else {
                    System.out.print(str.charAt(i));
                }
            }

            System.out.println(str2 + "ay");
        }

        sc.close();
    }
}