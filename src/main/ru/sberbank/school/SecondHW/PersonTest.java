package main.ru.sberbank.school.SecondHW;

/**
 * Created by Wais on 13.09.2016.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person pasha = new Person(true, "Pavel");
        Person masha = new Person(false, "Masha");
        pasha.marry(masha);
        Person gleb = new Person(true, "Gleb");
        Person anna = new Person(false, "anna");

        System.out.println(pasha.status());
        System.out.println(masha.status());
        System.out.println(gleb.status());
        System.out.println(anna.status());

        gleb.marry(pasha);
        anna.marry(anna);

        System.out.println();
        System.out.println(pasha.status());
        System.out.println(masha.status());
        System.out.println(gleb.status());
        System.out.println(anna.status());

        gleb.marry(anna);

        System.out.println();
        System.out.println(pasha.status());
        System.out.println(masha.status());
        System.out.println(gleb.status());
        System.out.println(anna.status());

    }
}
