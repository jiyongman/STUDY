package boj;
import java.util.*;

public class BOJ2439 { // 별 찍기 - 2

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}