package lessen16;

import java.util.Scanner;

public class Lessen_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] c = sc.nextLine().toLowerCase().split(" ");

        int number_A = 0, number_B = 0;

        for (int i = 0; i < c.length; i++){
            if (c[i].startsWith(a) && c[i].endsWith(b)){
                number_A++;
            }
            if (c[i].startsWith(b) && c[i].endsWith(a)){
                number_B++;
            }
        }

        System.out.println(number_A);
        System.out.println(number_B);
    }
}
