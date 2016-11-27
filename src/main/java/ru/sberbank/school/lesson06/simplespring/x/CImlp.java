package ru.sberbank.school.lesson06.simplespring.x;

import ru.sberbank.school.lesson06.simplespring.Component;
import ru.sberbank.school.lesson06.simplespring.D;

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
