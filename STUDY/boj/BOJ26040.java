package boj;
import java.util.*;

public class BOJ26040 { // 특정 대문자를 소문자로 바꾸기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] A = sc.nextLine().toCharArray();
        String[] B = sc.nextLine().split(" ");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j].charAt(0)) {
                    A[i] += 32;
                }
            }

            System.out.print(A[i]);
        }

        sc.close();
    }
}