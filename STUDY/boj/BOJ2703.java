package boj;
import java.util.*;

public class BOJ2703 { // Cryptoquote

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine(); // 암호화된 메시지
            char[] arr = sc.nextLine().toCharArray(); // 변환 규칙

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ') {
                    System.out.print(arr[str.charAt(j) - 'A']);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}