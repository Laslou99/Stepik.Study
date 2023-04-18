package lessen13;

import java.util.Scanner;

public class Lessen_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]){
                cont++;
            }
        }
        System.out.println(cont);
    }
}
