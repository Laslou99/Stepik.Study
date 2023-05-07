package lessen16;

import javax.swing.text.Style;
import java.util.Scanner;

public class Lessen_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] c = sc.nextLine().toLowerCase().split(" ");

        int num_A = 0, num_B = 0;

        for (int i = 0; i < c.length; i++){
            if (c[i].startsWith(a) && c[i].endsWith(b)){
                num_A++;
            }
            if (c[i].startsWith(b) && c[i].endsWith(a)){
                num_B++;
            }
        }

        System.out.println(num_A + "\n" + num_B);
    }
}