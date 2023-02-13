package lessen8;

import java.util.Scanner;

public class lessen5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            count++;
            a = sc.nextInt();
        }
        System.out.println(count);
    }
}
