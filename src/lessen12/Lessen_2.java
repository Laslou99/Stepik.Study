package lessen12;

import java.util.Scanner;

public class Lessen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int b = sc.nextInt();       // Умножение

        for (int i = 0; i < n; i++){
            System.out.println(a[i] * b);
        }
    }
}