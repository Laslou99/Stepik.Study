package lessen12;

import java.util.Scanner;

public class Lessen_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (a[i] % 2 != 0){
                sum += a[i];
            }
        }
    }
}
