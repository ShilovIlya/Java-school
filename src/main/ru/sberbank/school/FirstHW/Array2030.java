package main.ru.sberbank.school.FirstHW;

import java.util.Scanner;

/**
 * Created by Wais on 12.09.2016.
 *
 * Задан массив из n чисел (a1, a2,..., an).
 *
 * Ваша задача — подсчитать количество пар (i, j), 1 ≤ i ≤ j ≤ n,
 * что сумма чисел, стоящих на позициях i, i+1,..., j-1, j равна 0.
 *
 *
 * Входные данные
 * В первой строке задано число n (1 ≤ n ≤ 2000).
 * Во второй строке заданы целые числа a1, a2,..., an, которые записаны через пробел (-100 ≤ ai ≤ 100).
 *
 *
 * Выходные данные
 * Выведите в выходной файл единственное число — количество искомых пар.
 */
public class Array2030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] array = new Integer[n];
        try {
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода - введено не целое число");
        }
        int zeroPairCounter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isSumZero(array, i, j)) {
                    zeroPairCounter++;
                }
            }
        }
        System.out.println(zeroPairCounter);
        sc.close();
    }
    private static boolean isSumZero(Integer [] arr, Integer start, Integer end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return (sum == 0);
    }
}
