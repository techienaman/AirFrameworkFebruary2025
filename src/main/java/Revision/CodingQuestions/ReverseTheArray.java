package Revision.CodingQuestions;

public class ReverseTheArray {

    public static void main(String[] args){
        int[] arr={1, 4, 3, 2, 6, 5};
//        reverseTheArray(arr);
        reverseArrayUsingRecursion(arr,0,arr.length-1);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void reverseArrayUsingRecursion(int[] arr,int i,int j){
        if(i>=j){
            return;
        }
        swap(arr,i,j);
        reverseArrayUsingRecursion(arr,i+1,j-1);
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverseTheArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }
}
