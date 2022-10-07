package boj;
import java.util.*;

public class BOJ2954 { // 창영이의 일기장

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 창영이가 일기장에 작성한 문장
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str2 += ch;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                i += 2;
            }
        }

        System.out.println(str2);
        sc.close();
    }
}