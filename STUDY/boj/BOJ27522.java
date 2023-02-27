package boj;
import java.util.*;

public class BOJ27522 { // 카트라이더: 드리프트

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            String[] arr = sc.nextLine().split(" ");
            map.put(arr[0], arr[1]);
        }

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        int red = 0;
        int blue = 0;
        int i = 0;

        for (String key : keys) {
            if (map.get(key).equals("R")) {
                red += score[i];
            } else {
                blue += score[i];
            }
            i++;
        }

        if (red > blue) {
            System.out.println("Red");
        } else {
            System.out.println("Blue");
        }

        sc.close();
    }
}