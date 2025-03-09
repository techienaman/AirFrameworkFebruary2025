package Revision.CodingQuestions;

public class ReArrangeArray {

    public static void main(String[] args) {
        int[] arr={2,0,4,0,5,0,7,9,17};
        reArrangeArrays(arr);

        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]+" ");
        }
    }

    public static int findEven(int n){
        if(n%2==0){
            return 1;
        }
        return -1;

    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reArrangeArrays(int[] arr){
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if(findEven(arr[i])==1){
                i++;
                j++;
            }
            else if(findEven(arr[i])==-1 && findEven(arr[j])==1){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(findEven(arr[i])==-1 && findEven(arr[j])==-1){
                j++;
            }
        }
    }
}
