package lessen13;

import java.util.Scanner;

public class Lessen_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == k){
                count++;
            }
        }
        System.out.println(count);
    }
}
