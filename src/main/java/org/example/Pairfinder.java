package org.example;

import java.util.*;

public class Pairfinder {
//    public static void findAllPairs(List<Integer> listA, List<Integer> listB) {
//        if (listA == null || listB == null) {
//            System.out.println("Both can be null");
//            return;
//        }
//        Set<Integer> setA = new HashSet<>(listA);
//        Set<Integer> setB = new HashSet<>(listB);
//
//        for (Integer a : listA) {
//            if (setB.contains(a)) {
//                System.out.println(a + "," + a);
//            }}}
public static List<Integer> findAllPairs(List<Integer> listA, List<Integer> listB) {
    Set<Integer> setA = new HashSet<>(listA);
    List<Integer> commonElements = new ArrayList<>();

    for (Integer num : listB) {
        if (setA.contains(num)) {
            commonElements.add(num);
        }
    }

    return commonElements;
}
    public static void main(String[] args) {
        List<Integer> listA = List.of(1, 3, 2);
        List<Integer> listB = List.of(4, 2, 5, 3);
        List<Integer> result = findAllPairs(listA, listB);
        System.out.println(result);
    }
}