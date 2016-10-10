package main.ru.sberbank.school.FourthHW;

public class UseCountMap {
    public static void main(String[] args) {
        //пример использования
        CountMap<Integer> map = new CountMapIml<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(7);
        map.add(5);
        map.add(10);
        System.out.println(map.getCount(5));  // 2
        System.out.println(map.getCount(6));  // 1
        System.out.println(map.getCount(10));  // 3

    }
}
