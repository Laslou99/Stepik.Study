package lessen14;

import java.util.Scanner;

public class Lessen_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int [][] massif = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                massif[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++){
            for (int i = n - 1; i >= 0; i--){
                System.out.print(massif[i][j] + " ");
            }
            System.out.println();
        }
    }
}
