package lessen10;

import java.util.Scanner;

public class lessen3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (int)Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
