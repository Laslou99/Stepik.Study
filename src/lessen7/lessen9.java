package lessen7;

import java.util.Scanner;

public class lessen9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = 0;
        int day = 1;
        while (x < y){
            z = x * 0.1;
            x += z;
            day++;
        }
        System.out.println(day);
    }
}
