package lessen13;

import java.util.Scanner;

public class Lessen_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
