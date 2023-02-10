import java.util.Scanner;

public class start1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((y * y + x * x < 5) && (x * x - 3 > y) && (0.5 * x - 1) < y){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
