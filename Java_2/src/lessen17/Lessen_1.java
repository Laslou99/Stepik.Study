package lessen17;

import java.util.Scanner;

public class Lessen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        String a = sc.nextLine();
        char[] chars = a.toCharArray();
        for(int i = 0; i < chars.length; i++)
            if(chars[i] == 'f'){
                f++;
            }
        System.out.println(f);
    }

}
