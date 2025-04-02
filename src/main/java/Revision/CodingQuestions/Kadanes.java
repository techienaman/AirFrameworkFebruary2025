package Revision.CodingQuestions;

public class Kadanes {
    public static void main(String[] args){
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println(findMaximumSubArray(arr));
    }

    public static int findMaximumSubArray(int[] arr){
        int currentSum=0;
        int maxSubArraySum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSubArraySum){
                maxSubArraySum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSubArraySum;


    }

}
