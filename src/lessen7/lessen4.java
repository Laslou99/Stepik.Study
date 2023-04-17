package lessen7;

import java.util.Scanner;

public class lessen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        double count = 0;
        while (a !=0) {
            count ++;
            b += a;
            a = sc.nextInt();
        }
        System.out.println(b/count);
    }
}
