package boj;
import java.util.*;

public class BOJ4909 { // Judging Olympia
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[6];
		
		while (true) {
			for (int i = 0; i < 6; i++) {
				arr[i] = sc.nextDouble(); // the task of grading the submissions
			}
			
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0 && arr[4] == 0 && arr[5] == 0) {
				break;
			}
			
			Arrays.sort(arr);
			double avg = (arr[1] + arr[2] + arr[3] + arr[4]) / 4;
			
			if (avg % 1 == 0) {
				System.out.println((int) avg);
			} else {
				System.out.println(avg);
			}
		}
		
		sc.close();
	}
}