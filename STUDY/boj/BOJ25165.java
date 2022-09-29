package boj;
import java.util.*;

public class BOJ25165 { // 영리한 아리의 포탈 타기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 광야의 크기(행)
        int M = sc.nextInt(); // 광야의 크기(열)
        int Ac = sc.nextInt(); // 아리가 처음 위치한 칸의 열의 값
        int D = sc.nextInt(); // 아리의 진행 방향
        int Sr = sc.nextInt(); // 부하 몬스터의 위치(행)
        int Sc = sc.nextInt(); // 부하 몬스터의 위치(열)

        if (N % 2 > 0) {
            if (D == 0) {
                if (Sr == N || (Sr == 1 && Ac < Sc)) {
                    System.out.println("YES!");
                } else {
                    System.out.println("NO...");
                }
            } else {
                if (Sr == 1 && Ac > Sc) {
                    System.out.println("YES!");
                } else {
                    System.out.println("NO...");
                }
            }
        } else {
            if (D == 0) {
                if (Sr == 1 && Ac < Sc) {
                    System.out.println("YES!");
                } else {
                    System.out.println("NO...");
                }
            } else {
                if (Sr == N || (Sr == 1 && Ac > Sc)) {
                    System.out.println("YES!");
                } else {
                    System.out.println("NO...");
                }
            }
        }

        sc.close();
    }
}