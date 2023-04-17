package lessen7;

import java.util.Scanner;

public class lessen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (0 < a) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }
}
