package test;

import chapter04.CaseInsensitiveFileComparator;
import chapter04.Person2;
import chapter04.Person3;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        var abc = "";
        NestedClassTest nestedClassTest = new NestedClassTest();
        nestedClassTest.getCurrentState();

        File file1 = new File("/c");
        File file2 = new File("/d");
        CaseInsensitiveFileComparator.INSTANCE.compare(file1, file2);

        Person2.Loader.fromJSON("");
        Person3.Companion.fromJSON("");
    }
}

