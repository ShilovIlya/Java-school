package main.com.sbt;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Wais on 15.09.2016.
 */
public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();

        Person ivanov = new Person(1, "Ivanov", "111");

        persons.add(ivanov);
        persons.add(new PrivilegedPerson(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));
        persons.add(new Person(4, "Semenov", "444"));

        System.out.println(persons.contains(ivanov));
        System.out.println(persons.contains(new Person(1, "Ivanov", "111")));

        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person instanceof  PrivilegedPerson) {
                iterator.remove();
            }
        }

        System.out.println(persons);
    }
}
