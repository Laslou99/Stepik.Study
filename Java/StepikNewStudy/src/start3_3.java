import java.util.Scanner;

public class start3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        if (a.equals(b) && b.equals(c)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}