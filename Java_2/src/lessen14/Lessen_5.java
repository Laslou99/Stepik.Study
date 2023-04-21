package lessen14;

import java.util.Scanner;

public class Lessen_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] massif = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                massif[i][j] = sc.nextInt();
            }
        }

        boolean def = true;
        for (int  i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (massif[i][j] != massif[j][i]) {
                    def = false;
                }
            }
        }

        if (def){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
