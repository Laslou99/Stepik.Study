import java.util.Scanner;

public class start1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        if (t > 22.4){
            System.out.println("Тепло!");
        } else if (t == 22.4) {
            System.out.println("Прохладно...");
        } else {
            System.out.println("Холодно(");
        }
    }
}
