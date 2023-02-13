package lessen_1_To_6;

import java.util.Scanner;

public class start1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((0 <= a) && (a <= 9)) {
            System.out.println(1);
        } else if ((10 <= a) && (a <= 99)) {
            System.out.println(2);
        } else if ((100 <= a) && (a <= 999)) {
            System.out.println(3);
        } else if (a >= 1000) {
            System.out.println(4);
        }
    }
}
