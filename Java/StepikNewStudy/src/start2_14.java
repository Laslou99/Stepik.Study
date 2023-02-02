import java.util.Scanner;

public class start2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();
        int m = sc.nextInt();
        System.out.print((x * t) + y * m);
    }
}