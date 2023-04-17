package lessen12;

import java.util.Scanner;

public class Lessen_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] kegli = new int[n];
        for (int i = 0; i < k; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            for (int j = a - 1; j < b; j++) {
                kegli[j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (kegli[i] == 0) {
                System.out.print("I");
            } else {
                System.out.print(".");
            }
        }
    }
}
