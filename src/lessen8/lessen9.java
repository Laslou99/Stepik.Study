package lessen8;

import java.util.Scanner;

public class lessen9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String star = "*";
        for (int i = 1; i <= a ; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
