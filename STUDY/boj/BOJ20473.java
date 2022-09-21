package boj;
import java.util.*;

public class BOJ20473 { // Гостиница

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // the delegation size
        int a2 = 0; // the number of double rooms to be allocated to the delegation
        int a3 = 0; // the number of triple rooms to be allocated to the delegation
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == 3 * i + 2 * j) {
                    a3 = i;
                    a2 = j;
                    break;
                }
            }
        }

        System.out.println(a2 + " " + a3);
        sc.close();
    }   
}