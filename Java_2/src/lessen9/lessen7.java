package lessen9;

import java.util.Scanner;

public class lessen7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int um = 1;
        for (int i = 1; i <= n; i++){
            um *= i;
        }
        System.out.println(um);
    }
}
