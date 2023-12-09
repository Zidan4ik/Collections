package structure.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableExm1 {
    public static void main(String[] args) {
        //collection mutable
        List array = new ArrayList<>();
        array.add("Roma");
        array.add("Dima");
        array.add("Dasha");
        array.add("Vasya");


        //collection immutable
        List immutableArray = Collections.unmodifiableList(array);
        array.add("Ruslan");
//        immutableArray.add("Grisha");
        System.out.println("Before: "+array);
        System.out.println("After: "+immutableArray);
    }
}
