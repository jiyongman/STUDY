package boj;
import java.util.*;

public class BOJ13939 { // Imena

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            if (arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z') {
                cnt++;

                for (int j = 1; j < arr[i].length(); j++) {
                    if ((arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') || arr[i].charAt(j) == '.' || arr[i].charAt(j) == '?' || arr[i].charAt(j) == '!') {
                        cnt++;
                    }
                }
            }

            if (cnt == arr[i].length()) {
                result++;
            }

            if (arr[i].charAt(arr[i].length() - 1) == '.' || arr[i].charAt(arr[i].length() - 1) == '?' || arr[i].charAt(arr[i].length() - 1) == '!') {
                System.out.println(result);
                result = 0;
            }
        }

        sc.close();
    }
}