package lessen15;

import java.util.Scanner;

public class Lessen_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] array = new int[n][m];
        int max = -99999;
        String str = "";
        int count = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                array[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (array[i][j] > max){
                    max = array[i][j];
                }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (max == array[i][j]){
                    count++;
                    str += i + " ";
                    break;
                }

        System.out.println(count);
        System.out.println(str);
    }
}
