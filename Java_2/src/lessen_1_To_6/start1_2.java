package lessen_1_To_6;

import java.util.Scanner;

class start1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 10){
            System.out.println("No");
        }
        if (n >= 10 && n < 100 ) {
            System.out.println("Yes");
        }
        if (n >= 100){
            System.out.println("No");
        }
    }
}