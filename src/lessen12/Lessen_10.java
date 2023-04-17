package lessen12;

import java.util.Scanner;

public class Lessen_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] array = new int[b - a + 1];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)Math.pow(a, 3);
            a++;
        }

        int n = sc.nextInt();
        boolean res = false;
        for (int i = 0; i < n; i++){
            int N = sc.nextInt();
            for (int j = 0; j < array.length; j++){
                if (Math.pow(N, 3) == array[j]){
                    res = true;
                    break;
                } else {
                    res = false;
                }
            }
            System.out.println(res ? (int)Math.pow(N, 3) : "Error");
        }
    }
}
