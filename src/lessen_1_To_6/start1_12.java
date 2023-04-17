package lessen_1_To_6;

import java.util.Scanner;

public class start1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 21){
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }
}
