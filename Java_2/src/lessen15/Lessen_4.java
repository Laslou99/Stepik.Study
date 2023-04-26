package lessen15;

import java.util.Scanner;

public class Lessen_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();

            if (i > 1){
                if ((array[i - 2] < array[i - 1]) && (array[i] < array[i - 1])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
