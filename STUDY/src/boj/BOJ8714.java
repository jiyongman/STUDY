package boj;
import java.util.*;
import java.io.*;

public class BOJ8714 { // Monety
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // the number of Bytie's coins
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0; // the coin is on the obverse
		
		for (int i = 0; i < n; i++) {
			int ai = Integer.parseInt(st.nextToken());
			
			if (ai == 0) {
				cnt++;
			} 
		}
		
		int min = Math.min(cnt, n - cnt);
		
		System.out.println(min);
		br.close();
	}
}