package lessen11;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class lessen4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i, year = 2020;
        boolean is = false;
        while(year<2300) {
            i = k - (2 * n);
            n++;
            k++;
            if (i == 0) {
                is = true;
                break;
            }
            year++;
        }
    }
}
