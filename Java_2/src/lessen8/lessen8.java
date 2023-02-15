package lessen8;

import java.util.Scanner;

public class lessen8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int m = 1;

        while (true){
            int s = sc.nextInt();
            c += 1;
            m *= s;

            if (n <= m){
                break;
            }
        }
        System.out.print(c + " ");
        System.out.print(m);
    }
}
