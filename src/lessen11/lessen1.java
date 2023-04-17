package lessen11;

import java.util.Scanner;

public class lessen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a <= b) {
            System.out.println(b);
            b -= 2;
        }
    }
}
