package boj;
import java.util.*;

public class BOJ2752 { // 세수정렬

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 오름차순으로 정렬

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}