package lessen13;

import java.util.Scanner;

public class Lessen_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = array[a] + array[b];
        System.out.println(result);
    }
}