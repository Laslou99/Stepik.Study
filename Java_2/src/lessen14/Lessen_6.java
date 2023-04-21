package lessen14;

import java.util.Scanner;

public class Lessen_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 2147483647;
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
                min = Math.min(arr[i][j],min);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(min==arr[i][j]){
                    System.out.print(i+" "+j);
                }
            }
        }
    }
}
