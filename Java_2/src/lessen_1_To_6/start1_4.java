package lessen_1_To_6;

import java.util.Scanner;

public class start1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("inf");
        } else {
            System.out.println(a != 0 ? "1" : "0");
        }
    }
}
