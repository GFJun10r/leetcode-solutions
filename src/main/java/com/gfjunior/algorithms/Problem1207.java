package com.gfjunior.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class Problem1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrenceCounterMap = new HashMap<>();
        for (int i : arr) {
            occurrenceCounterMap.put(i, occurrenceCounterMap.getOrDefault(i, 0) + 1);
        }
        HashSet<Integer> uniqueOccurrences = new HashSet<>(occurrenceCounterMap.values());
        return uniqueOccurrences.size() == occurrenceCounterMap.size();
    }
}
