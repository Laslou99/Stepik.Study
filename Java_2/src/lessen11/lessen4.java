package lessen11;

import java.util.Scanner;

public class lessen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int year = 2020;
        int f = k - 2 * n;
        if (f >= 0){
            System.out.println(f + year);
        } else {
            System.out.println("Никогда");
        }
    }
}