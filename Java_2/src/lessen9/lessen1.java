package lessen9;

import java.util.Scanner;

public class lessen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =n;
        int sum = 0;
        while (a>0) {
            a--;
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.print(sum);
    }
}
