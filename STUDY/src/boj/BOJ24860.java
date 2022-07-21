package boj;
import java.util.*;

public class BOJ24860 { // Counting Antibodies

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int VK = sc.nextInt(); // number of gene fragment variants for k-light chain V
        int JK = sc.nextInt(); // number of gene fragment variants for k-light chain J
        int VL = sc.nextInt(); // number of gene fragment variants for l-light chain V
        int JL = sc.nextInt(); // number of gene fragment variants for l-light chain J
        int VH = sc.nextInt(); // number of gene fragment variants for k-light chain V
        int DH = sc.nextInt(); // number of gene fragment variants for heavy chain D
        int JH = sc.nextInt(); // number of gene fragment variants for heavy chain J
        long K = VK * JK;
        long L = VL * JL;
        long H = VH * DH * JH;
        long result = H * (K + L);

        System.out.println(result);
        sc.close();
    }
}