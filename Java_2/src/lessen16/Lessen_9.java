package lessen16;

import java.util.Scanner;

public class Lessen_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] recipe = new String[n];
        for (int i = 0; i < n; recipe[i++] = sc.nextLine()) ;
        int m = sc.nextInt();
        sc.nextLine();
        String replacement = "";
        for (int i = 0; i < m; i++) {
            replacement += sc.nextLine();
            if (i < m - 1) replacement += " - ";
        }
        String[] replacementArray = replacement.split(" - ");
        String[] replacementBigArray = new String[replacementArray.length];
        for (int i = 0; i < replacementArray.length; i++) {
            String firstLetterStr = "" + replacementArray[i].charAt(0);
            String firstLetterBig = firstLetterStr.toUpperCase();
            String letter = replacementArray[i].substring(1);
            replacementBigArray[i] = firstLetterBig + letter;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < replacementArray.length - 1; j += 2) {
                recipe[i] = recipe[i].replaceAll(replacementArray[j], replacementArray[j + 1]);
                recipe[i] = recipe[i].replaceAll(replacementBigArray[j], replacementBigArray[j + 1]);
            }
            System.out.println(recipe[i]);
        }
    }
}