package lessen15;

import java.util.Scanner;

public class Lessen_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = n - 1; j >= 0; j--){
                if (i == j) array[i][j] = 1;
                if (j > i) array[i][j] = 0;
                if (i > j) array[i][j] = 2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
