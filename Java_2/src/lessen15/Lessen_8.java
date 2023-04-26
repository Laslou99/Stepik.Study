package lessen15;

import java.util.Scanner;

public class Lessen_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = sc.nextInt();

                if (i < 1) sum1 += array[i][j];
                if (j < 1) sum2 += array[i][j];
            }
            sum3 += array[i][i];
        }

        System.out.println((sum1 == sum2 && sum2 == sum3) ? "YES" : "NO");
    }
}
