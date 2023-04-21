package lessen14;

import java.util.Scanner;

public class Lessen_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j)
                    mas[i][j] = 1;
                if (i < j)
                    mas[i][j] = 0;
                if (i > j)
                    mas[i][j] = 2;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
