package lessen10;

import java.util.Scanner;

public class lessen13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int um = 1;
        while (n != 0){
            a = n / 10;
            n = n % 10;
            um *= n;
            n = a;
        }
        System.out.println(um);
    }
}
