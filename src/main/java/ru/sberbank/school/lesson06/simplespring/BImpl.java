package ru.sberbank.school.lesson06.simplespring;

/**
 * Created by svetlana on 25.09.16.
 */
@Component
public class BImpl implements B{

    @Override
    public String getSomeData() {
        return "BImpl";
    }
}
