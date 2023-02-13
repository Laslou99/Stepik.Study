package lessen_1_To_6;

import java.util.Scanner;

public class start1_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((x * x - 3 > y) && (y * y + x * x < 5)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
