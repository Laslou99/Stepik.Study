package lessen11;

import java.util.Scanner;

public class lessen7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int m = 0;

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()){
            if (i % 3 == 0) {
                t++;
            }
            if (i < 0){
                m++;
            }
        }
        if (m > t){
            System.out.println("negative");
        } else if (t > m) {
            System.out.println("333");
        }
        else {
            System.out.println("Equal");
        }
    }
}
