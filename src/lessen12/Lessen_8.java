package lessen12;

import java.util.Scanner;

public class Lessen_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            boolean result = true;
            for (int u = 0; u < a.length; u++){
                if (a[i] == a[u] && i != u){
                    result = false;
                    break;
                }
            }
            if (result){
                System.out.println(a[i]);
            }
            result = true;
        }
    }
}
