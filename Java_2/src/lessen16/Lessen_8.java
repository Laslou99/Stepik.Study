package lessen16;

import java.util.Scanner;

public class Lessen_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        String[] words = a.split("\\.");
        byte x = 0;
        for(String word : words) {
            if (word.isEmpty()) break;
            int n = Integer.parseInt(word);
            if ( n>=0 && n<=255) x++;
        }
        System.out.println(x == 4 ? "YES" : "NO");
    }

}