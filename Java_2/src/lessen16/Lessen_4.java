package lessen16;

import java.util.Scanner;

public class Lessen_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word_1 = sc.nextLine();
        String word_2 = sc.nextLine();
        String Str = sc.nextLine();
        String Result = Str.replace(word_1, word_2);
        System.out.println(Result);
    }
}
