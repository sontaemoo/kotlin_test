package chapter06;

import java.util.List;

public class CollectionUtil {
    public static List<String> uppercaseAll(List<String> items) {
        for(int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }
}
