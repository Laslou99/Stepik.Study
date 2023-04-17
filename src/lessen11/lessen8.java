package lessen11;

import java.util.Scanner;

public class lessen8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        int maxAge = age;
        int minAge = age;
        String maxName = name;
        String minName = name;

        for (int i = 0; i < n - 1; i++){
            name = sc.next();
            age = sc.nextInt();

            if (age > maxAge){
                maxAge = age;
                maxName = name;
            }
            if (age < minAge){
                minAge = age;
                minName = name;
            }
        }
        System.out.println(minName);
        System.out.println(maxName);
    }
}
