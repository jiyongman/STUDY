package boj;
import java.util.*;

public class BOJ25755 { // 거울반사

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String W = sc.next(); // 임스가 뒤집고자 하는 방향
        int N = sc.nextInt(); // 배열의 크기
        String[][] arr = new String[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.next();

                if (arr[i][j].equals("2")) {
                    arr[i][j] = "5";
                } else if (arr[i][j].equals("5")) {
                    arr[i][j] = "2";
                } else if (arr[i][j].equals("1")) {
                    arr[i][j] = "1";
                } else if (arr[i][j].equals("8")) {
                    arr[i][j] = "8";
                } else {
                    arr[i][j] = "?";
                }
            }
        }

        if (W.equals("L") || W.equals("R")) {
            for (int i = 0; i < N; i++) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.printf("%s ", arr[i][j]);
                }

                System.out.println();
            }
        } else {
            for (int i = N - 1; i >= 0; i--) {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%s ", arr[i][j]);
                }

                System.out.println();
            }
        }

        sc.close();
    }
}