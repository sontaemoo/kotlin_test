package chapter08;

import chapter08._8_1_3FunTypeCallInJavaKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.List;

public class ChapterEight {
    public static void main(String[] args) {
        _8_1_3FunTypeCallInJavaKt.processTheAnswer(number -> number + 1);

        List<String> strings = new ArrayList<>();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
    }
}

