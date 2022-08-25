package boj;
import java.util.*;

public class BOJ22380 { // 割り勘

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	
        	if (N == 0 && M == 0) {
        		break;
        	}
        
        	int[] A = new int[N];
        	int sum = 0;
        	
        	for (int i = 0; i < N; i++) {
        		A[i] = sc.nextInt();
        		
        		if (A[i] < M / N) {
        			sum += A[i];
        		} else {
        			sum += M / N;
        		}
    		}
    		
    		System.out.println(sum);
        }
        
        sc.close();
	}
}