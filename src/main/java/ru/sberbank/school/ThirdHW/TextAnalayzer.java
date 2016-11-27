package main.java.ru.sberbank.school.ThirdHW;

import java.util.*;

/**
 * Created by Wais on 15.09.2016.
 *

 1.Подсчитайте количество различных слов в файле.
 2.Выведите на экран список различных слов файла, отсортированный по возрастанию их длины (компаратор сначала по длине слова, потом по тексту).
 3.Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
 4.Выведите на экран все строки файла в обратном порядке.
 5.Реализуйте свой Iterator для обхода списка в обратном порядке.
 6.Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.

 */
public class TextAnalayzer {

    private static final String  text = "First line and some words ok where what why when\n"+
            "one two free four five six seven eight nine ten\n" +
            "one line ggggg some qqqq and ssss\n" +
            "line some 1 2 3 4 5 6 9 10 11 12 14\n";


    public static void main(String[] args) {
        System.out.println(text);
        String [] words = text.split(" |\n");
        System.out.println();

        //task 1:
        TreeSet<String> wordsSet = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.equals(t1)) {
                    return 0;
                }
                if (s.length() > t1.length())
                    return -1;
                else
                    return 1;
            }
        }) {
        };


        HashMap<String, Integer> wordCounts = new HashMap<>();
        Boolean isNewWord = false;
        for (String word : words) {
            wordsSet.add(word);
            if (wordCounts.containsKey(word))
                wordCounts.put(word, wordCounts.get(word) + 1);
            else
                wordCounts.put(word, 1);
        }
        System.out.println("task 1");
        System.out.println("Unicum words count is : " + wordsSet.size());

        //task 2:
        System.out.println();
        System.out.println("task 2");
        System.out.println(wordsSet.toString());

        //task 3:
        System.out.println();
        System.out.println("task 3");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.print(entry.getKey() + " - " + entry.getValue() + "; ");
        }

        //task 4:
        System.out.println("\n");
        System.out.println("task 4");


        Stack<String> lines = new Stack<>();
        String [] strs = text.split("\n");
        for (String line : strs) {
            lines.push(line);
        }
        while (!lines.isEmpty()) {
            System.out.println(lines.pop());
        }


    //task 5:

        System.out.println("\n");
        System.out.println("task 5");
    }
}