package boj;
import java.util.*;

public class BOJ11094 { // 꿍 가라사대

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            if (str.length() >= 9) {
                if (str.substring(0, 10).equals("Simon says")) {
                    System.out.println(str.substring(10));
                }
            }
        }

        sc.close();
    }
}