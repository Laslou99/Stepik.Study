package lessen13;

import java.util.Scanner;

public class Lessen_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 0 || a >= n || b < 0 || b >= n) {
                System.out.println("Error");
            } else {
                int sum = array[a] + array[b];
                System.out.println(sum);
            }
        }
    }
}
