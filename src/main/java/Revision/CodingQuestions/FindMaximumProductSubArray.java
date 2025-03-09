package Revision.CodingQuestions;

public class FindMaximumProductSubArray {

    public static void main(String[] args) {
        int[] arr={-1, -3, -10, 1, 6};
        System.out.println(findMaximumSubArray(arr));
    }


    public static int findMaximumSubArray(int[] arr){
        int leftToRightMax=Integer.MIN_VALUE;
        int rightToLeftMax=Integer.MIN_VALUE;
        int leftToRight=1;
        int rightToLeft=1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                leftToRight=1;
            }
            else{
                leftToRight=leftToRight*arr[i];
                if(leftToRightMax<leftToRight){
                    leftToRightMax=leftToRight;
                }
            }
        }

        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==0){
                rightToLeft=1;
            }
            else{
                rightToLeft=rightToLeft*arr[j];
                if(rightToLeftMax<rightToLeft){
                    rightToLeftMax=rightToLeft;
                }
            }
        }
        return Math.max(leftToRightMax,rightToLeftMax);

    }
}
