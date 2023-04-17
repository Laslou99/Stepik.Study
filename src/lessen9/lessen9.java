package lessen9;

import java.util.Scanner;

public class lessen9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++){
            sum += (int)Math.pow(a, i);
        }
        System.out.println(sum);
    }
}
