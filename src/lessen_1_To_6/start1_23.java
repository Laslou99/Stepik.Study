package lessen_1_To_6;

import java.util.Scanner;

public class start1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(n<= k ? (m * 2) : n * 2 % k == 0 ? (n * 2 / k * m) :
                (n * 2 / k * m + m));
    }
}
