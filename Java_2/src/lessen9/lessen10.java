package lessen9;

import java.util.Scanner;

public class lessen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int n = sc.nextInt(); n > 0; n /= 2){
            System.out.print(n % 2);
        }
    }
}
