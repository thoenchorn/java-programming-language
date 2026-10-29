package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Module 08: Map stores key-value pairs and cannot contain duplicate keys.
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Dara", 18);
        ages.put("Sok", 21);
        ages.put("Bora", 19);
        ages.put("Dara", 19); // replaces the value for the existing key

        System.out.println("Ages: " + ages);
        System.out.println("Dara's age: " + ages.get("Dara"));
        System.out.println("Contains Sok: " + ages.containsKey("Sok"));

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String sentence = "java is fun and java is powerful";
        Map<String, Integer> wordCounts = new TreeMap<>();
        for (String word : sentence.split(" ")) {
            wordCounts.merge(word, 1, Integer::sum);
        }
        System.out.println("Word counts: " + wordCounts);
    }
}
