package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Module 08: Set implementations reject duplicate values.
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Java"); // ignored
        System.out.println("HashSet (no order guarantee): " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Kotlin");
        linkedHashSet.add("Python");
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10); // ignored
        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
    }
}
