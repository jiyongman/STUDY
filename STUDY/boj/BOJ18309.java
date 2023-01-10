package boj;
import java.util.*;

public class BOJ18309 { // Extreme Temperatures

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 50;
        int max = -50;

        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");

            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, Integer.parseInt(arr[i]));
                max = Math.max(max, Integer.parseInt(arr[i]));
            }
        }

        System.out.printf("%d %d", min, max);
        sc.close();
    }
}