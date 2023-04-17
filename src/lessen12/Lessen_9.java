package lessen12;

import java.util.Scanner;

public class Lessen_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int a = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0 && i != n - 1) {
                a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
