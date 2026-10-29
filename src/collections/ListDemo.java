package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Module 08: ordered collections with List and ArrayList.
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("Python");
        languages.add("Java"); // duplicates are allowed in a List

        System.out.println("Languages: " + languages);
        System.out.println("Size: " + languages.size());
        System.out.println("First: " + languages.get(0));
        System.out.println("Contains Kotlin: " + languages.contains("Kotlin"));

        languages.remove("Python");
        System.out.println("After remove: " + languages);

        Collections.sort(languages);
        System.out.println("Sorted: " + languages);

        System.out.println("Iterating with a for-each loop:");
        for (String language : languages) {
            System.out.println("  - " + language);
        }
    }
}
