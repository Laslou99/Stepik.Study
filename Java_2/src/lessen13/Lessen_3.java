package lessen13;

import java.util.Scanner;

public class Lessen_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}