package lessen7;

import java.util.Scanner;

public class lessen8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i <= n){
            count += i * i;
            i++;
        }
        System.out.println(count);
    }
}
