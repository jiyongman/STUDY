package boj;
import java.util.*;

public class BOJ9971 { // The Hardest Problem Ever

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String start = sc.nextLine();

            if (start.equals("ENDOFINPUT")) {
                break;
            }

            char[] arr = sc.nextLine().toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 'A' && arr[i] <= 'Z') {
                    arr[i] -= 5;
                } else {
                    System.out.print(arr[i]);
                    continue;
                }

                if (arr[i] < 'A') {
                    arr[i] += 26;
                }

                System.out.print(arr[i]);
            }

            String end = sc.nextLine();

            System.out.println();
        }

        sc.close();
    }
}