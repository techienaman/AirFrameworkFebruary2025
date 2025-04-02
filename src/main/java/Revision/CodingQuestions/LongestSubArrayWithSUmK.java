package Revision.CodingQuestions;

import java.util.HashMap;

public class LongestSubArrayWithSUmK {

    public static void main(String[] args){
        int[] arr={10, 5, 2, 7, 1, -10};
        int k=15;
        //System.out.println(findLongestSubArrayWithSumAsK(arr,15));
        System.out.println(findLongestSubArrayWithSumAsK(arr,15));
    }

    public static int findLongestSubarrayWithSumask(int[] arr,int k){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,-1);
        int maxLength=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            int val=sum-k;
            if(hashMap.containsKey(val)){
                int index=hashMap.get(val)+1;
                maxLength=Math.max(maxLength,(i-index)+1);

            }
            if(!hashMap.containsKey(sum)){
                hashMap.put(sum,i);
            }
        }
        return maxLength;
    }

    public static int findLongestSubArrayWithSumAsK(int[] arr,int k){
        int i=0;
        int j=0;
        int maxlength=0;
        int sum=0;

        while(j<arr.length ){
            sum=sum+arr[j];
            if(sum==k){
                maxlength=Math.max(maxlength,(j-i)+1);
            }
            if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    if(sum==k){
                        maxlength=Math.max(maxlength,(j-i)+1);
                    }
                    i++;

                }
            }
            j++;

        }
        return maxlength;
    }

}
