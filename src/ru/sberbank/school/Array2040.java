package ru.sberbank.school;

import java.util.Scanner;

/**
 * Created by Wais on 12.09.2016.
 *
 * Циклическим сдвигом на k строки p = (p1, p2,..., pn) называется строка pk = (pk+1, pk+2,..., pn, p1,..., pk).
 *
 * Ваша задача — найти наименьший в лексикографическом порядке сдвиг данной строки.
 *
 *
 * Входные данные
 * Входные данные состоят из единственной строки p, состоящей только из маленьких латинских букв.
 * Длина строки не превосходит 1000 символов.
 *
 *
 *Выходные данные
 * Выведите искомый наименьший циклический сдвиг данной строки p.
 */
public class Array2040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String baseString = sc.next();
        System.out.println(baseString.substring(1,3) + " " + baseString.length());
        String [] shifts = new String[baseString.length()];
        for (int i = 0; i < baseString.length(); i++) {
            shifts[i] = baseString.substring(baseString.length() - i, baseString.length()) +
                                                                    baseString.substring(0, baseString.length() - i);
        }
        int lexMinIndex = 0;
        for (int i = 1; i < shifts.length; i++) {
            lexMinIndex = isMinLexString(shifts[lexMinIndex], shifts[i]) ? lexMinIndex : i;
        }
        System.out.println(shifts[lexMinIndex]);
        sc.close();
    }
    
    private static boolean isMinLexString(String first, String second) {
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) > second.charAt(i)) {
                return false;
            } else if (first.charAt(i) < second.charAt(i)) {
                return true;
            }
        }
        return true;
    }
}
