package lessen9;

import java.util.Scanner;

public class lessen12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0,t=0;

        for (int k = sc.nextInt(); k!=0; k = sc.nextInt()) {

            if(max<k) {
                max = k;
                t = 0;
            }


            if (max ==k)
                ++t;

        }

        System.out.println(t);
    }
}