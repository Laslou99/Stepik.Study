package lessen11;

import java.util.Scanner;

public class lessen6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String sum = "";
        StringBuilder sum_plus = new StringBuilder(sum) ;
        while (true){
            sum = String.valueOf(n%k);
            sum_plus.append(sum);
            n /= k;
            if (n == 0)break;
        }
        System.out.println(sum_plus.reverse());
    }
}