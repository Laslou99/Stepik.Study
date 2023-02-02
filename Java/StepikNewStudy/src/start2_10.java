import java.util.Scanner;

public class start2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((x % 10) + n);
    }
}