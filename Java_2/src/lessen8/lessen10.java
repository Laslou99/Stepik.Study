package lessen8;

import java.util.Scanner;

public class lessen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="*";
        int i=sc.nextInt();
        int j=1;
        int aboba=1;
        while(j<=i){
            System.out.println(" ".repeat(i-j)+a.repeat(aboba));
            j++;
            aboba+=2;
        }
    }
}
