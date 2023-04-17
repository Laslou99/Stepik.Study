package lessen12;

import java.util.Scanner;

public class Lessen_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int place = 1;
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int petia = sc.nextInt();
        for (int i = 0; i < n; i++){
            if (a[i] >= petia){
                place++;
            }
        }
        System.out.println(place);
    }
}
