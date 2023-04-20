package lessen14;

import java.util.PropertyPermission;
import java.util.Scanner;

public class Lessen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mas[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (mas[i][j] < 10){
                    System.out.print(mas[i][j] + " ");
                } else {
                    System.out.print(mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}