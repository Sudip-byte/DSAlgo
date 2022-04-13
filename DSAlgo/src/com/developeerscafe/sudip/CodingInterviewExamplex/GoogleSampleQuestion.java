package com.developeerscafe.sudip.CodingInterviewExamplex;

import java.util.HashSet;
import java.util.Set;

public class GoogleSampleQuestion {

    public static void main(String[] args) {

        Integer[] array = {1,2,4,4};
        Integer targetSum = 8;

        System.out.println("Is Pair Found :: "+isPairFound(array, targetSum));

    }

    private static boolean isPairFound(Integer[] array, int targetSum)
    {

        // An set that will contain the complement of each element.
        Set<Integer> complementSet = new HashSet<>();

        for(Integer element : array)
        {
            // If the complement set contains the current ith element then pair is found.
            if(complementSet.contains(element))
                return true;
            else
                // Else we will store the complement of the ith element.
                complementSet.add(targetSum-element);
        }

        return false;
    }

}
