package lessen8;

import java.util.Scanner;

public class lessen6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            sum += a;
            a = sc.nextInt();
        }
        System.out.println(sum);
    }
}
