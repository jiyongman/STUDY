package boj;
import java.util.*;

public class BOJ13163 { // 닉네임에 갓 붙이기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine()); // 닉네임의 수

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            arr[0] = arr[0].replaceAll(arr[0], "god");

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }

            System.out.println();
        }

        sc.close();
    }
}