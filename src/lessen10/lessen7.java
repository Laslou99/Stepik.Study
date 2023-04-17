package lessen10;

import java.util.Scanner;

public class lessen7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long um = 1;
        while (a <= b) {
            um *= a;
            a++;
        }
        System.out.println(um);
    }
}
