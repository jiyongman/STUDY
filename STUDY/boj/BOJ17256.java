package boj;
import java.util.*;

public class BOJ17256 { // 달달함이 넘쳐흘러

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++) { // ax, ay, az
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[3];

        for(int i = 0; i < 3; i++) { // cx, cy, cz
            arr2[i] = sc.nextInt();
        }

        int bx = arr2[0] - arr[2]; // cx - az
        int by = arr2[1] / arr[1]; // cy / ay
        int bz = arr2[2] - arr[0]; // cz - ax

        System.out.print(bx+ " " + by+ " " + bz);
        sc.close();
    }
}