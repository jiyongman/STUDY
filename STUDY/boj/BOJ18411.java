package boj;
import java.util.*;

public class BOJ18411 { // 試験 (Exam)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt(); // the scores of the three exams
		}
		
		Arrays.sort(arr);
		System.out.println(arr[1] + arr[2]);
		sc.close();
	}
}