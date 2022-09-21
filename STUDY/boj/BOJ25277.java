package boj;
import java.util.*;

public class BOJ25277 { // Culture shock

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // the number of words Thore speaks
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            
            if (str.equals("he") || str.equals("him") || str.equals("she") || str.equals("her")) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }   
}