package boj;
import java.util.*;

public class BOJ24378 { // КАСТИНГ

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // the maximum or minimum number of actors the director should interview
        int n = sc.nextInt(); // the number of actors working in the theater
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt(); // the actors which are tall, blue-eyed and blond
        }

        Arrays.sort(arr);

        if (m == 1) {
            if (arr[0] + arr[1] + arr[2] <= 2 * n) {
                System.out.println(0);
            } else {
                System.out.println(arr[0] + arr[1] + arr[2] - (2 * n));
            }
        } else {
            System.out.println(arr[0]);
        }

        sc.close();
    }   
}