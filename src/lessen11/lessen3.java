package lessen11;

import java.util.Scanner;

public class lessen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int pin_code_coincided = 5;
        while (pin_code_coincided > 0){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            if(correct.equals(vasya)){
                System.out.println("CORRECT");
                break;
            }else{
                System.out.println("INCORRECT " + counter);
            }
            counter++;
            pin_code_coincided --;
        }
        if (pin_code_coincided == 0){
            System.out.println("Error");
        }
    }
}