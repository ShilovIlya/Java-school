package main.java.ru.sberbank.school.FirstHW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Wais on 12.09.2016.
 *
 * Рассмотрим алгоритм кодирования по Хаффману.
 * Каждый символ представляется последовательностью символов 0 и 1, причем никакая
 * последовательность не является началом другой. Закодированный текст представляет
 * собой сконкатенированные последовательности букв.
 * Например, если e=001, t=01, x=000, то text=0100100001.
 *
 * Вам даны коды некоторых букв латинского алфавита, а также текст в закодированном виде.
 * Ваша задача — раскодировать его. Гарантируется, что текст составлен корректно.
 *
 *
 * Входные данные
 * Первая строка входного файла содержит единстенное число n — количество букв, используемых в тексте.
 * Далее в n строках находятся пары из символа и последовательности, его кодирующей.
 * Все символы — это строчные латинские буквы. Кодирующая последовательность — строка из символов 0 и 1,
 * длиной не более 30 символов. Символ и код разделены одним пробелом. Последняя строка входных данных
 * содержит закодированный текст длиной не более 1000 символов.
 *
 *
 * Выходные данные
 * Выведите полученный после декодирования текст.
 */
public class Strings2044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Character> codeTable = new HashMap<>();
        Character letter;
        String letterCode;
        for (int i = 0; i < n; i++) {
            letter = sc.next().charAt(0);
            letterCode = sc.next();
            codeTable.put(letterCode, letter);
        }
        String encodedString = sc.next();

        int startLetterCode = 0;
        int endLetterCode = 0;
        StringBuilder decodedString = new StringBuilder("");
        letter = null;
        for (int i = 0; i < encodedString.length(); i++) {
            endLetterCode = i;
            if (codeTable.containsKey(encodedString.substring(startLetterCode, endLetterCode + 1))) {
                letter = codeTable.get(encodedString.substring(startLetterCode, endLetterCode + 1));
                System.out.print(letter + " ");
                decodedString.append(letter);
                startLetterCode = i + 1;
            }
        }
        System.out.println("\n" + decodedString);
        sc.close();
    }
}
