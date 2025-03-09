package Revision.CodingQuestions;

public class IncrementNumberRepresentedAsAnArray {
    public static void main(String[] args) {
        int[] arr={9,9,9,9};
        int[] arr1=incrementNumberRepresentedByAnArray(arr);
        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }
    }

    public static int[] incrementNumberRepresentedByAnArray(int[] arr){

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }

        int[] newArray=new int[arr.length+1];
        newArray[0]=1;

        return newArray;
    }
}
