package lessen16;

import java.util.Scanner;

public class Lessen_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String a = sc.nextLine();
        System.out.println(number.indexOf(a));
        System.out.println(number.lastIndexOf(a));
    }
}
