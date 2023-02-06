import java.util.Scanner;

public class start3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int l;
        int s;
        if (N < M) {
            l = M;
            s = N;
        } else {
            l = N;
            s = M;
        }
        int a = l - y;
        int b = s - x;
        if (x < a && x < y && x < b) {
            System.out.print(x);
        } else if (y < x && y < a && y < b) {
            System.out.print(y);
        } else if (a < x && a < y && a < b)
            System.out.print(a);
        else {
            System.out.print(b);
        }
    }
}