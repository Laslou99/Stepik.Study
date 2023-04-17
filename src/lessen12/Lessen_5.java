package lessen12;

import java.util.Scanner;

public class Lessen_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeMas = sc.nextInt();

        int[] mas = new int[sizeMas];


        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            if (i % 2 == 0)
                sum += mas[i];

        }
        System.out.println(sum);
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0)
                System.out.println(mas[i]);
        }
    }
}