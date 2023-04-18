package lessen13;

import java.util.Scanner;

public class Lessen_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        double check = 0;
        double sum = 0;
        double arifmetics = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int i = sc.nextInt();

        for (int x = l; x <= i; x++) {
            sum += array[x];
            check++;
        }
        arifmetics = sum / check;
        System.out.println( arifmetics);
    }
}
