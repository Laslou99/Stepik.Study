package lessen15;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Lessen_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            Arrays.sort(array);
            System.out.print(array[i] + " ");
        }
    }
}
