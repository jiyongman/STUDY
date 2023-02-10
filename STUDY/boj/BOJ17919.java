package boj;
import java.util.*;

public class BOJ17919 { // Östgötska

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        double cnt = 0.0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("ae")) {
                cnt++;
            }
        }

        if (cnt / words.length >= 0.4) {
            System.out.println("dae ae ju traeligt va");
        } else {
            System.out.println("haer talar vi rikssvenska");
        }

        sc.close();
    }
}