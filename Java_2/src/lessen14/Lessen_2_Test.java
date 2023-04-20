package lessen14;

import java.util.Scanner;

public class Lessen_2_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 6;
        // пример заполнения
        int[][] mas = new int[n][];
        int[] mas0 = {1,3,4,5,3,6,7,246,35,62,56};
        mas[0] = mas0;
        mas[1] = new int[]{34, 4567, 344, 734, 6};
        mas[2] = new int[]{1};
        mas[3] = new int[]{34, 5, 42, 356, 4567, 344, 734, 6};
        mas[4] = new int[]{34, 5};


        //пример вывода
        for (int i = 0; i<n; i++){
            for (int j = 0; j<mas[i].length; j++) //length
                System.out.print(mas[i][j]+" ");
            System.out.println();
        }
    }
}
