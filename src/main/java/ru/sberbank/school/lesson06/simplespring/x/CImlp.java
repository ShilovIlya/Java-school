package main.java.ru.sberbank.school.lesson06.simplespring.x;

import main.java.ru.sberbank.school.lesson06.simplespring.Component;
import main.java.ru.sberbank.school.lesson06.simplespring.D;

/**
 * Created by svetlana on 26.09.16.
 */
@Component
public class CImlp implements D {

    @Override
    public String getSomeStr() {
        return "CImpl";
    }
}
