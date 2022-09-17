package boj;
import java.util.*;

public class BOJ8958 { // OX퀴즈

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int i = 0; i < A; i++) {
            int sum = 0;
            int add = 1;
            String str = sc.next();
            
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='O') {
                    sum += add;
                    add++;
                } else {
                    add = 1;
                }
            }
            
            System.out.println(sum);
		}
		
		sc.close();
	}
}