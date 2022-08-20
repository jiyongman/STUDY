package boj;
import java.util.*;
import java.io.*;

public class BOJ8719 { // Piłeczka
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine()); // the number of data sets
		
		for (int i = 0; i < x; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xi = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			while (xi < w) {
				xi *= 2;
				cnt++;
			}
			
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}