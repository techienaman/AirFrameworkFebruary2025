package Revision.CodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

    public static void main(String[] args){
        int[] arr={2,5,10,7,10};
        int k=14;
        findAllTheSubArrays(arr);
        System.out.println(findLongestSubArray(arr,k));
    }


    public static void findAllTheSubArrays(int[] arr){
        List<List<Integer>> list1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                List<Integer> list=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    list.add(arr[k]);

                }
                list1.add(list);
            }
        }
        System.out.println(list1);
    }

    public static int findLongestSubArray(int[] arr,int k){
        int i=0;
        int j=0;
        int sum=0;
        int maxLength=0;

        while(j<arr.length){
            sum=sum+arr[j];
            if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    i++;
                }
            }

            maxLength=Math.max(maxLength,(j-i)+1);
            j++;

        }
        return maxLength;
    }
}
