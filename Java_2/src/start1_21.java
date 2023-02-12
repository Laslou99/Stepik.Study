import java.util.Scanner;

public class start1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println((Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2) ? "YES" : "NO");
    }
}
