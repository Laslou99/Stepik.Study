package lessen7;

import java.util.Scanner;

public class lessen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while (i * i <= a){
            System.out.println(i * i);
            i++;
        }
    }
}
