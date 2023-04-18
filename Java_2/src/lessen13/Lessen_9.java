package lessen13;

import java.util.Scanner;

public class Lessen_9 {
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
                System.out.println(i);
                return;
            }
        }
        System.out.println("Error");
    }
}
