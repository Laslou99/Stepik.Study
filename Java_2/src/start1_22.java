import java.util.Scanner;

public class start1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 10 == 1 && n != 11){
            System.out.println(n + " корова");
        }else if (n % 10 >= 2 && n % 10 <= 4 && n / 10 != 1){
            System.out.println(n + " коровы");
        }else{
            System.out.println(n + " коров");
        }
    }
}
