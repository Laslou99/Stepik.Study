package lessen8;

import java.util.Scanner;

public class lessen7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num2;
        int i = 1;
        while (sum < num1) {
            sum = num2 * i;
            i++;
        }
        System.out.println(sum);
    }
}
