package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>();
        for (Integer s : set1) {
            union.add(s);
        }
        for (Integer s : set2) {
            union.add(s);
        }
        // 강의 답안
        // Set<Integer> union = new HashSet<>(set1);
        // union.addAll(set2);

        Set<Integer> intersection = new HashSet<>();
        for (Integer s : set1) {
            if (set2.contains(s)) {
                intersection.add(s);
            }
        }
        // 강의답안
        // Set<Integer> intersection = new HashSet<>(set1);
        // intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>();
        for (Integer s : set1) {
            if (!set2.contains(s)) {
                difference.add(s);
            }
        }
        // 강의답안
        // Set<Integer> difference = new HashSet<>(set1);
        // intersection.removeAll(set2);

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }
}
