package boj;
import java.util.*;

public class BOJ11587 { // MARKO

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of words in the dictionary
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();

            arr[i] = arr[i].replaceAll("[abc]", "2");
            arr[i] = arr[i].replaceAll("[def]", "3");
            arr[i] = arr[i].replaceAll("[ghi]", "4");
            arr[i] = arr[i].replaceAll("[jkl]", "5");
            arr[i] = arr[i].replaceAll("[mno]", "6");
            arr[i] = arr[i].replaceAll("[pqrs]", "7");
            arr[i] = arr[i].replaceAll("[tuv]", "8");
            arr[i] = arr[i].replaceAll("[wxyz]", "9");
        }

        String S = sc.next();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i].equals(S)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}