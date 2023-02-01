import java.util.Scanner;

public class start13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2, a3;
        int a = sc.nextInt();
        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;
        System.out.println(a1 + a2 + a3);
    }
}
