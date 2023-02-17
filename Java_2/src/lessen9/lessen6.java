package lessen9;

import java.util.Scanner;

public class lessen6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int max = a;
        int min = a;
        for(int i = 2; i <= n; i++){
            a = sc.nextInt();
            if(a > max)
                max = a;
            if(a < min)
                min = a;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
