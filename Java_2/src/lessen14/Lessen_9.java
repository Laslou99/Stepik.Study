package lessen14;

import java.util.Scanner;

public class Lessen_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int[][] resultArray = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[array[i].length - j - 1][i] = array[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(resultArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}