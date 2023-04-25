package lessen15;

import java.util.Scanner;

public class Lessen_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        int x = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {

            if (i - 1 >= 0){
                if (((arr[i]<0) && (arr[i-1]<0)) || ((arr[i]>0) && (arr[i-1]>0))) {
                    x = 0;
                } else {
                    x++;
                }
            }

        }
        if (n == 0) {
            System.out.print("YES");
        } else {
            if (x == arr.length - 1) {
                System.out.print("NO");
            } else {
                System.out.print("YES");
            }
        }
    }
}
