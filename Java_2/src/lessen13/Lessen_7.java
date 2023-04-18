package lessen13;

import java.util.Scanner;

public class Lessen_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length-1; j++){
            System.out.print(array[j] + array[j + 1] + " ");
        }
    }
}
