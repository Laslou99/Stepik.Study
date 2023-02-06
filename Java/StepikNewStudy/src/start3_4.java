import java.util.Scanner;

public class start3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b == 0){
            System.out.println("Error");
        } else {
            System.out.println(a / b);
        }
    }
}
