package boj;
import java.io.*;

public class BOJ10989 { // 수 정렬하기 3

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < 10001; i++) {
            while (arr[i] > 0) {
            	sb.append(i).append('\n');
            	arr[i]--;
            }
        }
            
        System.out.println(sb);
        br.close();
	}
}