package ru.sberbank.school.FourthHW;

import java.util.HashMap;
import java.util.Map;


public class CountMapIml<T> implements CountMap<T> {

    private Map<T, Integer> map;

    CountMapIml() {
        map = new HashMap<>();
    }

    @Override
    public void add(T t) {
        if (map.containsKey(t)) {
            map.put(t, map.get(t) + 1);
        } else {
            map.put(t, 1);
        }
    }

    @Override
    public int getCount(T t) {
        return map.get(t);
    }

    @Override
    public int remove(T t) {
        int result = map.get(t);
        map.remove(t);
        return result;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<? extends T> source) {
        Map<T, Integer> copyMap = source.toMap();
        for (Map.Entry<T, Integer>  entry : copyMap.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue() + 1);
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public Map<? super T, ? super Integer> toMap() {
        return new HashMap<>(map);
    }

    @Override
    public void toMap(Map<? super T, ? super Integer> destination) {
        destination.putAll(map);
    }
}
