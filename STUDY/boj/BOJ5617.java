package boj;
import java.util.*;

public class BOJ5617 { // 問題 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0; // the number of triangles
        int b = 0; // the number of right triangles
        int c = 0; // the number of acute triangles
        int d = 0; // the number of obtuse triangles

        while (true) {
            int[] arr = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if (arr[0] + arr[1] <= arr[2]) {
                break;
            } else {
                a++;

                if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                    b++;
                } else if (arr[0] * arr[0] + arr[1] * arr[1] > arr[2] * arr[2]) {
                    c++;
                } else {
                    d++;
                }
            }
        }

        System.out.printf("%d %d %d %d\n", a, b, c, d);
        sc.close();
    }
}