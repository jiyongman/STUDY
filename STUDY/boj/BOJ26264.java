package boj;
import java.util.*;

public class BOJ26264 { // 빅데이터? 정보보호!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 물어본 학생의 수
        String str = sc.next();
        str = str.replaceAll("bigdata", "b");
        str = str.replaceAll("security", "s");
        int b = 0;
        int s = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b') {
                b++;
            } else {
                s++;
            }
        }

        if (b > s) {
            System.out.println("bigdata?");
        } else if (b < s) {
            System.out.println("security!");
        } else {
            System.out.println("bigdata? security!");
        }

        sc.close();
    }
}