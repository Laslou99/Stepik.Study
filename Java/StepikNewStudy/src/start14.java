import java.util.Scanner;

public class start14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(((109 + (v * t)) % 109) % 109);
    }
}
