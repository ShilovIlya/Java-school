package ru.sberbank.school.FirstHW;

import java.util.Scanner;

/**
 * Created by Wais on 12.09.2016.
 *
 * Дан набор из n слов, состоящих из маленьких латинских букв.
 *
 * Будем называть слово странным, если в нем встречаются 3 или более гласные буквы подряд.
 *
 * Ваша задача — удалить из данного набора все странные слова.
 *
 * Гласными буквами в латинском алфавите считаются e,y,u,i,o,a.
 *
 *
 * Входные данные
 * В первой строке содержится число n — количество слов в наборе, n не превосходит 100.
 * Далее в n строках по одному на строке содержатся слова из набора.
 * Слова состоят только из маленьких латинских букв. Длина каждого слова не менее 1 и не более 20 символов.
 *
 *
 * Выходные данные
 * Выведите все слова из набора, не являющиеся странными.
 * Каждое слово выводите на отдельной строке в том порядке, в котором они заданы во входных данных.
 */
public class Strings2036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word;
        for (int i = 0; i < n; i++) {
            word = sc.next();
            if (isWordNormal(word)) {
                System.out.println(word);
            }
        }
        sc.close();
    }

    public static boolean isWordNormal(String word) {
        int vowelCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vowelCounter++;
            } else {
                vowelCounter = 0;
            }
            if (vowelCounter == 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVowel(char c) {
        if ((c == 'e') || (c == 'y') ||(c == 'u') ||(c == 'i') ||(c == 'o') ||(c == 'a')) {
            return true;
        }
        return false;
    }
}
