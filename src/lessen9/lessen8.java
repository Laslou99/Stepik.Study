import java.util.Scanner;

public class lessen8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String str;

        while (true) {
            str = sc.next();
            if (str.equals("СТОП")) {
                break;
            }

            int x = Integer.parseInt(str);

            if ( (x!=0) && (sum!=0) ) {
                sum *= x;
            } else if (x!=0) {
                sum += x;
            }
        }

        System.out.print( (sum != 0) ? sum : "Не найдено" );
    }
}