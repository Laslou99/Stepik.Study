package lessen15;

import java.util.Scanner;

public class Lessen_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxI = 0, maxJ = 0, max = -99999999;
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
                if (array[i][j] > max){
                    max = array[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxI + " " + maxJ);
    }
}
