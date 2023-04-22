package lessen14;

import java.util.Scanner;

public class Lessen_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr [][] = new int[a][a];
        int ett = 0;
        int ett1 = 0;

        int ind = 0;
        int ind1 = 0;
        int k =0;
        int k1 =0;


        for (int i = 0; i<a ; i++){
            for (int j = 0; j<a ; j++){
                arr[i][j] = sc.nextInt();

                ett = arr[i][j]+ ett;

            }
            if (ett == k){
                ind = ind+1;
            }
            k = ett;
            ett = 0;

        }

        for (int i = 0; i<a ; i++){
            for (int j = 0; j<a ; j++){
                ett1 = arr[j][i] + ett1;

                if (ett1 == k1){
                    ind1 = ind1+1;

                }

            }
            k1 = ett1;
            ett1 = 0;

        }

        if (ind == a-1 && ind1 == a-1 ){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
