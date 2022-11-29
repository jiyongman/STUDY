package boj;
import java.util.*;

public class BOJ26041 { // 비슷한 전화번호 표시

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] A = sc.nextLine().split(" ");
        String B = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i].length() >= B.length()) {
                if (!A[i].equals(B) && A[i].substring(0, B.length()).equals(B)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}