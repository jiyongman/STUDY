package boj;
import java.util.*;

public class BOJ17826 { // 나의 학점은?

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];

        for (int i = 0; i < 50; i++) {
            arr[i] = sc.nextInt(); // 학생들의 점수
        }

        int n = sc.nextInt(); // 홍익이가 받은 점수
        int rank = 0;

        for (int i = 0; i < 50; i++) {
            if (arr[i] == n) {
                rank = i + 1;
            }
        }

        if (rank <= 5) {
            System.out.println("A+");
        } else if (rank <= 15) {
            System.out.println("A0");
        } else if (rank <= 30) {
            System.out.println("B+");
        } else if (rank <= 35) {
            System.out.println("B0");
        } else if (rank <= 45) {
            System.out.println("C+");
        } else if (rank <= 48) {
            System.out.println("C0");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}