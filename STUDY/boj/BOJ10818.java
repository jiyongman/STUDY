package boj;
import java.util.*;

public class BOJ10818 { // 최소, 최대

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int arr[] = new int[N];
        
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
      
        Arrays.sort(arr); // 오름차순으로 정렬
        
        System.out.println(arr[0] + " " + arr[N - 1]);
		sc.close();
	}
}