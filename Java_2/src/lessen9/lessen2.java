package lessen9;

import java.util.Scanner;

public class lessen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        for (int i =0;i<a;i++){
            int b = sc.nextInt();
            if (b%2==0){
                count++;}
        }
        System.out.print(count);
    }
}
