package Revision.CodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args){
        int[] arr={16, 17, 4, 3, 5, 2};
        System.out.println(findLeadersInAnArray(arr));

    }

    public static List<Integer> findLeadersInAnArray(int[] arr){
        List<Integer> list=new ArrayList<>();
        int i=arr.length-1;
        int maximumNumber=arr[arr.length-1];

        while(i>=0){
            if(maximumNumber<arr[i]){
                maximumNumber=arr[i];
            }
            if(arr[i]>=maximumNumber){
                list.add(0,arr[i]);
            }
            i--;
        }
        return list;
    }
}
