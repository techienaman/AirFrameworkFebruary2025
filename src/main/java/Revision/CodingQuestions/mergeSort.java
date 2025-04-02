package Revision.CodingQuestions;

import java.util.ArrayList;
import java.util.List;

public class mergeSort {
    public static void main(String[] args){
        int[] arr={3,1,2,4,1,5,2,6,4};
        /*
                3,1,2,4,1    5,2,6,4
                3,1,2  4,1    5,2,6 4
                3,1 2  4,1    5,2,6 4
                3,1,          5 2
         */
        mergeSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void mergeSort(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else if(arr[right]<=arr[left]){
                list.add(arr[right]);
                right++;
            }

        }
        if(left>mid){
            while(right<=high){
                list.add(arr[right]);
                right++;
            }

        }
        if(right>high){
            while(left<=mid){
                list.add(arr[left]);
                left++;
            }
        }


        for(int i=0;i<list.size();i++){
            arr[low+i]=list.get(i);
        }
    }
}
