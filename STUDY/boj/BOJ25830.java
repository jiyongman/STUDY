package boj;
import java.util.*;

public class BOJ25830 { // Microwave Mishap

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // what Donald has entered
        int t = Integer.parseInt(str.substring(0, 2)) * 3600 + Integer.parseInt(str.substring(3)) * 60;
        int t2 = Integer.parseInt(str.substring(0, 2)) * 60 + Integer.parseInt(str.substring(3));
        int h = (t - t2) / 3600;
        int m = (t - t2) / 60 % 60;
        int s = (t - t2) % 60;

        System.out.printf("%02d:%02d:%02d", h, m, s);
        sc.close();
    }
}
