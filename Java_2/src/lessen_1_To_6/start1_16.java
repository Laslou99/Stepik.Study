package lessen_1_To_6;

import java.util.Scanner;

public class start1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(((a < (b + c)) && (b < (a + c)) && (c < (a + b))) ? "Yes" : "No");
    }
}
