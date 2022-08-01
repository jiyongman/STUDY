package boj;
import java.util.*;
import java.io.*;

public class BOJ2869 { // 달팽이는 올라가고 싶다
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라갈 수 있는 거리
		int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 거리
		int V = Integer.parseInt(st.nextToken()); // 나무막대의 높이
		int D = (V - B) / (A - B); // 하루에 올라갈 수 있는 거리
		
		if ((V - B) % (A - B) != 0) {
			D++;
		}
		
		System.out.println(D);
		br.close();
	}
}