

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 7, 7, 6, 6}; //Solution 3
        int[] arr2 = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789}; // Solution 3
        int[] arr3 = {1, 7, 8, 9, 2, 11, 14, 19, 20, 5}; // Solution 5
        int[] arr4 = {1, 1, 1, 1}; // Solution 2
        int[] arr5 = {1, 1, 1, 1, 1, 2}; // Solution 2
        System.out.println (Solution(arr1));
        System.out.println (Solution(arr2));
        System.out.println (Solution(arr3));
        System.out.println (Solution(arr4));
        System.out.println (Solution(arr5));
    }

    public static int Solution (int[] candyArray){
        Set<Integer> candiesForGina = new HashSet<>();
        List<Integer> candiesForJake = new ArrayList<>();
        int totalCandiesToGive = candyArray.length/2;

        int index = 0;

        while (candiesForGina.size()< totalCandiesToGive && candiesForJake.size() < totalCandiesToGive){
            if (candiesForGina.contains(candyArray[index])){
                candiesForJake.add(candyArray[index]);
            }else{
                candiesForGina.add(candyArray[index]);
            }
            index++;
        }

        if(candiesForGina.size() == totalCandiesToGive) {
            return candiesForGina.size();
        }
          return candiesForGina.size()+1;

    }
}
