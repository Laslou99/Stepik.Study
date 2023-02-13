package lessen_1_To_6;

import java.util.Scanner;

public class start1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(a1 == a2 || b1 == b2 ? "YES" : "NO");
    }
}
