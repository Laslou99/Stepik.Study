package lessen9;

import java.util.Scanner;

public class lessen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = sc.nextInt(); true; i = sc.nextInt()){
            if (i % 7 == 0) {
                break;
            }
            if (i % 10 == 7) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
