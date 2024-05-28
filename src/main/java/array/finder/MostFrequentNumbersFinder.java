package array.finder;

import java.util.*;

/**
 * MostFrequentNumbersFinder class that finds the most frequently occurring number(s) in an array.
 */
public class MostFrequentNumbersFinder {
    /**
     * The main method that executes the program.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        // Initialize the array
        Integer[] array = {1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5};
        System.out.println("Input data: " + Arrays.toString(array));

        // Call the method to find the most frequently occurring number(s)
        List<Integer> maxCountNumbers = findMostFrequentNumbers(array);

        // Print the most frequently occurring number(s)
        System.out.println("Most frequent number(s): " + maxCountNumbers);
    }

    /**
     * Method finds and returns the most frequently occurring number(s) in an array.
     *
     * @param array The input array
     * @return A list of the most frequently occurring number(s)
     */
    public static List<Integer> findMostFrequentNumbers(Integer[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer i : array) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        int maxCount = Collections.max(countMap.values());
        List<Integer> maxCountNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxCountNumbers.add(entry.getKey());
            }
        }

        return maxCountNumbers;
    }
}
