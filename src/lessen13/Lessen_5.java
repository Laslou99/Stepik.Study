package lessen13;

import java.util.Scanner;

public class Lessen_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // количество элементов в массиве
        int[] array = new int[n]; // создаем массив
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt(); // заполняем массив введенными числами
        }
        int index1 = input.nextInt(); // первый индекс
        int index2 = input.nextInt(); // второй индекс
        if (index1 < 0 || index1 >= n || index2 < 0 || index2 >= n) {
            System.out.println("Error"); // проверка на выход индекса за пределы массива
        } else {
            int sum = array[index1] + array[index2]; // суммируем элементы с заданными индексами
            System.out.println(sum);
        }
    }
}
