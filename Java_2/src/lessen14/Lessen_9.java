package lessen14;

import java.util.Scanner;

public class Lessen_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] massif = new int[m][n];

        for (int i = 0; i < n; i++){
            for (int j = m - 1; j >= 0; j--){
                massif[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(massif[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
