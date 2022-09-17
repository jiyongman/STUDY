package boj;
import java.util.*;

public class BOJ11948 { // 과목선택

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int[] arr2 = new int[2];
		
		for (int i = 0; i < 4; i++) { // 물리, 화학, 생물, 지구과학
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 2; i++) { // 역사, 지리
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순으로 정렬
		Arrays.sort(arr2); // 오름차순으로 정렬
		
		int sum = 0;
		sum = arr[1] + arr[2] + arr[3] + arr2[1];
		
		System.out.println(sum);
		sc.close();
	}
}