package lessen7;

import java.util.Scanner;

public class lessen12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fm = a;
        int sm = 0;
        while (a != 0) {
            a = sc.nextInt();
            if (a > fm) {
                sm = fm;
                fm = a;
            }
            if (a < fm && a > sm) {
                sm = a;
            }
        }
        System.out.println(sm);
    }
}
