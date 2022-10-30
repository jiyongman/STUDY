package boj;
import java.util.*;

public class BOJ20336 { // Haughty Cuisine

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // the number of set menus

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }

            break;
        }

        sc.close();
    }
}