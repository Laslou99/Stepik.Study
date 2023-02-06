import java.util.Scanner;

public class start3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a - 10) > (a / 2)){
            System.out.println(a - 10);
        } else {
            System.out.println(a / 2);
        }
    }
}
