package boj;
import java.util.*;
import java.io.*;

public class BOJ18883 { // N M 찍기
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(cnt);
				cnt++;
				
				if (j < M - 1) {
					sb.append(" ");
				} else {
					sb.append("\n");
				}
			}
		}
		
		System.out.print(sb);
		br.close();
	}
}