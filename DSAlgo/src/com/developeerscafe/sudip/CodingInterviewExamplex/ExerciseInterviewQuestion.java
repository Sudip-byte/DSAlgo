package com.developeerscafe.sudip.CodingInterviewExamplex;

import java.util.*;

public class ExerciseInterviewQuestion {

    public static void main(String[] args) {

        Integer[] inventory = {1,2,3,4};
        Integer[] stock = {8,9,10};

        System.out.println("Does stock contains item of an inventory :: "+doesStockContainsItemOfInventory(inventory, stock));

    }

    private static boolean doesStockContainsItemOfInventory(Integer[] inventory, Integer[] stock){

        Set<Integer> inventorySet = new HashSet<>();

        Arrays.stream(inventory).forEach(inventoryItem -> inventorySet.add(inventoryItem));
        System.out.println("Inventory Set :: "+ inventorySet);

        for(Integer stockItem : stock) {
            if (inventorySet.contains(stockItem))
                return true;
        }

        //In here the time time-complexity will be O(n+m) which is linear

        return false;
    }

}
