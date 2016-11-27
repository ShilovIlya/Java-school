package main.java.ru.sberbank.school.lesson06.simplespring;

import main.java.ru.sberbank.school.lesson06.simplespring.x.CImlp;

/**
 * Created by svetlana on 25.09.16.
 */
@Component
public class A { //TODO: не абстрактный и не интерфейс

    @Autowired
    private B b;

    @Autowired
    private CImlp d;


    @PostConstruct
    public void init() {
        System.out.println("class A init");
    }

    public void execute() {
        System.out.println(b.getSomeData());
        System.out.println(d.getSomeStr());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("class A destroy");
    }

}
