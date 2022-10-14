package boj;
import java.util.*;

public class BOJ3181 { // 줄임말 만들기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String[] arr = str.split(" ");
        String[] arr2 = {"I", "PA", "TE", "NI", "NITI", "A", "ALI", "NEGO", "NO", "ILI"};

        System.out.print(arr[0].charAt(0));

        for (int i = 1; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr2.length; j++) {
                if (arr[i].equals(arr2[j])) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                System.out.print(arr[i].charAt(0));
            }
        }

        sc.close();
    }
}