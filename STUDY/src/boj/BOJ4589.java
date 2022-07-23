package boj;
import java.util.*;

public class BOJ4589 { // Gnome Sequencing

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of groups to process
        int[][] arr = new int[N][3];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        System.out.println("Gnomes:");

        for (int i = 0; i < N; i++) {
            if (arr[i][0] > arr[i][1] && arr[i][1] > arr[i][2]) {
                System.out.println("Ordered");
            } else if (arr[i][0] < arr[i][1] && arr[i][1] < arr[i][2]) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }

        sc.close();
    }
}