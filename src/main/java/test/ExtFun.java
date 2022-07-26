package test;


import collection.*;

import java.util.Arrays;
import java.util.List;


public class ExtFun {
    public static void main(String[] args){
        System.out.println(_3_3_0ExtFunKt.lastChar("test"));
        var list = List.of("1", "2", "3");

        System.out.println(StringFunctions.joinToString(list));
        System.out.println(StringFunctions.join(list));

        View view = new Button();
        _3_3_4OverrideKt.showOff(view);
        String a = "asdf";
        test1("a", "b");

    }
    public static void test1(String c, String ...b){

    }
}
