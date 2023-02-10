import java.util.Scanner;

public class start1_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((y > 0.5 * x - 1)  && (y < x * x - 3)  && (y * y < 5 - x * x) || (-2 > y && y > -3 && -1 < x && x < 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
