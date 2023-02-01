import java.util.Scanner;

public class start2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = x*t;
        int t1 = r/y;
        int t2 = t+t1;
        System.out.println(t2);
    }
}