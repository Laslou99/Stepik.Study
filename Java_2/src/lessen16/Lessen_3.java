package lessen16;

import java.util.Scanner;

public class Lessen_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int length = a.length();
        int length1 = a.length() - 2;
        String allButLast = a.substring(0, length1);
        System.out.println(a.charAt(2));
        System.out.println( a.charAt(length - 2));
        System.out.println(a.substring(0,5));
        System.out.println(allButLast);
        System.out.println(a.substring(3 , length));
        System.out.println(a.length());
    }
}
