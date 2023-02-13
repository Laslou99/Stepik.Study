package lessen_1_To_6;

import java.util.Scanner;

public class start1_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((x > 0) && (y > 0)) {
            if ((x * 2 < y) && (x * 3 > y)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
