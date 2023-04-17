package lessen7;

import java.util.Scanner;

public class lessen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a <= b){
            count = count + a;
            a++;
        }
        System.out.println(count);
    }
}
