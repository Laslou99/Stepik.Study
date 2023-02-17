package lessen9;

import java.util.Scanner;

public class lessen5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean is_cube = false;
        for (String s = sc.next(); true ; s = sc.next()) {
            if (s.equals("СТОП"))
                break;
            if (s.equals("Куб"))
                is_cube = true;
        }
        if (is_cube)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
