package lessen10;

import java.util.Scanner;

public class lessen5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long end = 1;

        for (long i = 1; i <= n; i++){
            long a = sc.nextLong();
            end = end * a;
        }
        System.out.println(end);
    }
}
