package boj;
import java.util.*;

public class BOJ14909 { // 양수 개수 세기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int cnt = 0;
		
		while (st.hasMoreTokens()) {
			
			if (Integer.parseInt(st.nextToken()) > 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}