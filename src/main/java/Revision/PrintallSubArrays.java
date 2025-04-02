package Revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintallSubArrays {
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        findAllSubArrays(arr);
        System.out.println("========================================");
        findAllSubArray(arr);
    }


        public static void findAllSubArrays(int[] arr) {
            List<List<Integer>> subarrays = new LinkedList<>();

            for (int i = 0; i < arr.length; i++) {  // Start index
                for (int j = i; j < arr.length; j++) {  // End index
                    List<Integer> subarray = new LinkedList<>();
                    for (int k = i; k <= j; k++) {  // Collect elements
                        subarray.add(arr[k]);
                    }
                    subarrays.add(subarray);
                }
            }

            System.out.println(subarrays);
        }



    public static void findAllSubArray(int[] arr){

        
        List<List<Integer>> list1=new LinkedList<>();
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                List<Integer>  list=new LinkedList<>();
                for(int k=i;k<=j;k++){

                    list.add(arr[k]);
                }
                list1.add(list);
            }
        }
        System.out.println(list1);
    }
}
