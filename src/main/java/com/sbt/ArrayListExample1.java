package main.java.com.sbt;

import java.util.ArrayList;

/**
 * Created by Wais on 15.09.2016.
 */
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>(10);

        Person ivanov = new Person(1, "Ivanov", "111");

        persons.add(ivanov);
        persons.add(new PrivilegedPerson(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));
        persons.add(new Person(4, "Semenov", "444"));

        System.out.println(persons.contains(ivanov));
        System.out.println(persons.contains(new Person(1, "Ivanov", "111")));


        System.out.println(persons);
    }
}
