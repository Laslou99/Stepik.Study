import java.util.Scanner;

public class start1_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (((x * 2.0) == y)) {
            System.out.println("No");
        } else {
            if ((((x * 2.0) > y))) {
                System.out.println("No");
            } else {
                if ((((x * 2.0) < y)))
                    System.out.println("Yes");
            }
        }
    }
}
