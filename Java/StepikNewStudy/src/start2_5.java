import java.util.Scanner;

public class start2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((h * 60 + m / 60) + m % 60);
    }
}
