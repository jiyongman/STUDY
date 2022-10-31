package boj;
import java.util.*;

public class BOJ6965 { // Censor

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].length() == 4) {
                    arr[j] = "****";
                }

                System.out.printf("%s ", arr[j]);
            }

            System.out.printf("\n\n");
        }

        sc.close();
    }
}