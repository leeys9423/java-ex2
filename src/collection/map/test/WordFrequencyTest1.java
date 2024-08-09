package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");

        Map<String, Integer> result = new HashMap<>();
        for (String str : textArr) {
            if (!result.containsKey(str)) {
                result.put(str, 1);
            } else {
                result.put(str, result.get(str) + 1);
            }
        }
        System.out.println(result);
    }
}
