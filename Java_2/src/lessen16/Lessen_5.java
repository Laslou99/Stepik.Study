package lessen16;

import java.util.Scanner;

public class Lessen_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        String str = sc.next();
        String result = String.join(str, arr);
        System.out.println(result);
    }
}
