package lessen14;

import java.util.Arrays;
import java.util.Scanner;

public class Lessen_7 {
    public static void main(String[] args) {
        int maxSum = 0;
        int maxSum_2 = 0;
        int index = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int[n][];

        for (int i = 0; i < n; i++){
            int m = sc.nextInt();
            mas[i] = new int[m];

            for (int j = 0; j < m; j++){
                mas[i][j] = sc.nextInt();
                maxSum = mas[i][j] + mas[i][j];
                if (maxSum > maxSum_2){
                    maxSum_2 = maxSum;
                    index = i;
                }
            }
        }

        System.out.println(index + 1);
        System.out.println(maxSum_2);
        System.out.println(Arrays.toString(mas[index]));
    }
}