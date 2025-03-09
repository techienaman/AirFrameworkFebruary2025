package Revision.CodingQuestions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthMaxAndMinElement {

    public static void main(String[] args){
        int n=3;
        int[] arr={7,10,4,3,20,15};
        System.out.println(findKthMaxElement(arr,n));
        System.out.println(findKthMinElement(arr,n));
    }


    public static int findKthMinElement(int[] arr,int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        for(int j=n;j<arr.length;j++){
            if(arr[j]<pq.peek()){
                pq.poll();
                pq.add(arr[j]);
            }
        }
        return pq.poll();
    }


    public static int findKthMaxElement(int[] arr,int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        for(int j=n;j<arr.length;j++){
            if(arr[j]>pq.peek()){
                pq.poll();
                pq.add(arr[j]);
            }
        }
        return pq.poll();
    }
}
