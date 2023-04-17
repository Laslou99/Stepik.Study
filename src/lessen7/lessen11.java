package lessen7;

import java.util.Scanner;

public class lessen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pos = 1000000;
        int i = 0;
        while (x != 0) {
            if (x > pos)
                i++;
            pos = x;
            x = sc.nextInt();
        }
        System.out.print(i);
    }
}
