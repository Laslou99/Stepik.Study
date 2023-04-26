package lessen15;

import java.util.Scanner;

public class Lessen_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        boolean simetri = true;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (array[i][j] != array[j][i])
                    simetri = false;
            }
        }
        if (simetri){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
