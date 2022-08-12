package boj;
import java.io.*;

public class BOJ15917 { // 노솔브 방지문제야!!
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()); // 수행해야 하는 쿼리의 개수
		
		for (int i = 0; i < Q; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if ((a & (-a)) == a) {
				sb.append(1 + "\n");
			} else {
				sb.append(0 + "\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}