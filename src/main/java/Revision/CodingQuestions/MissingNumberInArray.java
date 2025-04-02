package Revision.CodingQuestions;

public class MissingNumberInArray {
    public static void main(String[] args){
        int[] arr={1,2,3,5};
        System.out.println(findMissingNumbers(arr));

    }

    public static int findMissingNumbers(int[] arr){
        int n=arr.length+1;
        int naturalSum=0;
        int arraySum=0;

        for(int i=0;i<=n;i++){
            naturalSum=naturalSum+i;
        }

        for(int j=0;j<arr.length;j++){
            arraySum=arraySum+arr[j];
        }

        return naturalSum-arraySum;


    }
}
