package boj;
import java.util.*;

public class BOJ20959 { // Šifra

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("[abcdefghijklmnopqrstuvwxyz]", " ");
        String[] arr = str.split(" ");
        int[] arr2 = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
                continue;
            } else {
                arr2[Integer.parseInt(arr[i])]++;
            }
        }

        int cnt = 0;

        for (int i = 0; i < 1000; i++) {
            if (arr2[i] > 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}