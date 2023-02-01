import java.util.Scanner;

public class start2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int g = (t*10/1000+k*n)*x;
        System.out.println(g);
    }
}