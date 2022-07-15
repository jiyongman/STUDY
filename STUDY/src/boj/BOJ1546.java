package boj;
import java.util.*;

public class BOJ1546 { // 평균

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
    		arr[i] = sc.nextInt();
    	}

    	Arrays.sort(arr); // 오름차순으로 정렬
	    double M = arr[arr.length - 1]; // 최댓값

    	for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] / M) * 100;
    		sum += arr[i];
    	}
    	
		System.out.println(sum / N);
		sc.close();
	}
}