package lessen14;

import java.util.Scanner;

public class Lessen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr1 = new double[n];
        double[] arr2 = new double[n];

        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextDouble();

        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextDouble();

        for (int i = 0; i < n; i++)
            System.out.println(arr1[i] + arr2[i]);
    }
}