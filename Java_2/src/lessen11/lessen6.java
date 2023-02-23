package lessen11;

import java.util.Scanner;

public class lessen6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String p = "";
        if (n == 0){
            System.out.println(n);
        }
        while (n != 0) {
            if ((k > 2) && (n < 10)){
                p = n % k + p;
                n /= k;
            }
        }
        System.out.println(p);
    }
}
