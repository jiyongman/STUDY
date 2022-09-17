package boj;
import java.util.*;

public class BOJ10102 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // 심사위원의 수
        String str = sc.next();
        char[] arr = new char[V];

        for (int i = 0; i < V; i++) {
            arr[i] = str.charAt(i);
        }

        int cnt = 0;
        int cnt2 = 0;
        
        for (int i = 0; i < V; i++) {
            if (arr[i] == 'A') {
                cnt++;
            } else {
                cnt2++;
            }
        }

        if (cnt > cnt2) {
            System.out.println("A");
        } else if (cnt < cnt2) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }

        sc.close();
    }
}
