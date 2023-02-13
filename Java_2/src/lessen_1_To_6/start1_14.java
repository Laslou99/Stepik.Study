package lessen_1_To_6;

import java.util.Scanner;

public class start1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println((age < 21) ? "Нет" : "Да");
    }
}
