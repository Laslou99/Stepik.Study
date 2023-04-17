package lessen11;

import java.util.Scanner;

public class lessen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        String G = "No";
        while (n > 0) {
            a = sc.nextInt();
            if (a % 10 == 4) {
                G = "Yes";
            }
            n -= 1;
        }
        System.out.println(G);
    }
}
