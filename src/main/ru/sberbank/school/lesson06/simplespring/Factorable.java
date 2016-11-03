package main.ru.sberbank.school.lesson06.simplespring;

public interface Factorable {

    <T> T getBean(Class<T> cls);

    void close();

    void registryShutdownHook();
}
