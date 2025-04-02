package Revision.CodingQuestions;

public class IndexexOfSubArraySum {

    public static void main(String[] args){
        int[] arr={1,2,3,7,5};
        int target=12;
        int[] finalResult=findIndexOfSubArraySum(arr,target);
        for(int i=0;i<finalResult.length;i++){
            System.out.println(finalResult[i]);

        }


    }

    public static int[] findIndexOfSubArraySum(int[] arr,int target){
        int[] result=new int[2];
        int i=0;
        int j=0;
        int sum=0;
        while(sum<target && j<arr.length){
            sum=sum+arr[j];
            if(sum==target){
                result[0]=i;
                result[1]=j;
                return result;
            }
            else if(sum>target){
                while(sum>target){
                    sum=sum-arr[i];
                    i++;
                    if(sum==target){
                        result[0]=i+1;
                        result[1]=j+1;
                        return result;
                    }
                }
            }
            j++;
        }
        result[0]=-1;
        return result;


    }
}
