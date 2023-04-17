package lessen7;

import java.util.Scanner;

public class lessen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (a <= b){
            if ((a % 3 == 0) && (a % 5 != 0)){
                count++;
            }
            a++;
        }
        System.out.println(count);
    }
}
