package Revision.CodingQuestions;

import java.util.HashMap;

public class SlidingWindowQuestions {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k=15;
        findlongestSubArray(arr,k);
    }

    public static void findlongestSubArray(int[] arr,int k){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int prefixSum=0;
        int maxLength=0;
        hashMap.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefixSum=prefixSum+arr[i];
            int val=prefixSum-k;
            if(hashMap.containsKey(val)){
                int j=hashMap.get(val)+1;
                maxLength=(i-j)+1;
            }
            else{
                hashMap.put(prefixSum,i);
            }
        }
    }
}
