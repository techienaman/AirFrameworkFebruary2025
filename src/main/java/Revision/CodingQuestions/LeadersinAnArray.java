package Revision.CodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class LeadersinAnArray {
    public static void main(String[] args){
     int[] arr=   {16, 17, 4, 3, 5, 2};
        System.out.println(leaderinArray(arr));
    }

    public static List<Integer> leaderinArray(int[] arr){
        List<Integer> list=new ArrayList<>();

        int maxElement=arr[arr.length-1];

        for(int i=arr.length-1;i>=0;i--){
            if(maxElement<arr[i]){
                maxElement=arr[i];
            }
            if(arr[i]>=maxElement){
                list.add(0,arr[i]);
            }
        }
        return list;
    }


}
