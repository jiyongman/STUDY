package boj;
import java.util.*;

public class BOJ9243 { // 파일 완전 삭제

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        String str2 = sc.next();

        if (N % 2 > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str2.charAt(i)) {
                    System.out.println("Deletion failed");
                    return;
                }
            }

            System.out.println("Deletion succeeded");
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str2.charAt(i)) {
                    System.out.println("Deletion failed");
                    return;
                }
            }

            System.out.println("Deletion succeeded");
        }

        sc.close();
    }
}