package boj;
import java.util.*;

public class BOJ1718 { // 암호

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 평문
        String str2 = sc.next(); // 암호화 키
        String str3 = ""; // 암호문

        for (int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i) - str2.charAt(i % str2.length()) - 1;

            if (str.charAt(i) == ' ') {
                str3 += ' ';
            } else if (tmp >= 0) {
                str3 += (char) (tmp + 'a');
            } else {
                str3 += (char) (tmp + 1 + 'z');
            }
        }

        System.out.println(str3);
        sc.close();
    }
}