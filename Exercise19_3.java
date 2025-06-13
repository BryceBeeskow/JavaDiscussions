
package com.mycompany.exercise19_3;
//19.3 (Distinct elements in ) Write the following method that returns a new .The new list contains the nonduplicate elements from the original list.
//Bryce Beeskow

import java.util.ArrayList;
import java.util.Arrays;


public class Exercise19_3{

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){

        ArrayList<E> newArrayList = new ArrayList<>(list.size());
        for(E element : list){
            if(!newArrayList.contains(element)){
                newArrayList.add(element);
            }
        }
        return newArrayList;
    }

 

   

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.addAll(Arrays.asList("apple", "banana", "orange", "apple", "banana", "grape"));
        System.out.println(removeDuplicates(fruit));

       

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2, 12, 32, 12, 2,32, 54, 22, 4, 42));
        System.out.println(removeDuplicates(numbers));

    }

}