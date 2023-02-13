package lessen8;

import java.util.Scanner;

public class lessen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % k == 0)
                System.out.println(i);
            i++;
        }
    }
}
