package structure.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;

public class ImmutableExm2 {
    public static void main(String[] args) {
        Map<String,String> immutableMap = Map.of(
                "Roma","Pravnyk",
                "Denys","Derkach",
                    "Sanya","Volodko");

        System.out.println(immutableMap);


    }
}
