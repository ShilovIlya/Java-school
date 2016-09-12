package ru.sberbank.school.FirstHW;

import java.util.Scanner;

/**
 * Created by Wais on 12.09.2016.
 *
 * Задан массив из n чисел (a1, a2,..., an).
 *
 * С ним два раза повторяют следующую процедуру: одновременно все максимумы в массиве делят на два.
 * Нечетные числа при делении на два следует округлять вниз. Ваша задача — вывести массив после этих действий.
 *
 *
 * Входные данные
 * В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве.
 * Во второй строке через пробел записаны числа a1, a2,..., an (1 ≤ ai ≤ 100).
 *
 *
 * Выходные данные
 * Выведите массив после всех действий. Числа разделяйте пробелами.
 *
 */
public class Array2021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        Integer [] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] =  sc.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
        }
        int newmax = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == max) {
                array[i] /= 2;
            } else if (array[i] > max / 2){
                newmax = array[i];
            }
        }
        max = (newmax == 0) ? (max / 2) : newmax;
        System.out.println();
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] /= 2;
            }
        }
        System.out.println();
        printArray(array);
        sc.close();
    }

    public static void printArray(Integer [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
