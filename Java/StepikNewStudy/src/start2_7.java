import java.util.Scanner;

public class start2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(n - (s * d));
    }
}
