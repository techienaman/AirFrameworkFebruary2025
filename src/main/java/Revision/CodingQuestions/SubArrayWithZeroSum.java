package Revision.CodingQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] arr={4,2,-3,1,6};
        System.out.println(findSubArrayWithZeroSum(arr));
    }

    public static boolean findSubArrayWithZeroSum(int[] arr){
        int currentSum=0;

        HashSet<Integer> hashSet=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(hashSet.contains(currentSum)){
                return true;
            }

            hashSet.add(currentSum);
        }
        return false;

    }
}
