package lessen9;

import java.util.Scanner;

public class lessen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "Куб";
        boolean isStr = false;
        int count = 0;
        int sum = 0;
        for (String i = "СТОП"; !i.equals(str); str = sc.nextLine()) {
            if (str.equals("ээээ") || str.equals("потом")){
                count--;
            }

            count++;
            if (str.equals("Куб")) {
                isStr = true;
                sum += count;
            }
        }
        if (isStr == true) {
            System.out.println(sum);
        } else if (isStr == false) {
            System.out.println("NO");
        }
    }
}
